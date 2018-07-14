package com.ihome.android.launcher2;


import java.lang.reflect.Method;

import com.ott.plugin.service.IMyService;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;


public class HomeActivity extends Activity implements OnClickListener {

	ImageView imginternet, imgLive, imgLookback, imgDibbling, imgStore,
			imgMyApplication, imgPlay, imgSetting;
	TimeTextView tvTime;
	HorizontalScrollView scrollView;
	Handler handler;
	private IMyService iMyService;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		initView();
		imgLive.requestFocus();
		bind();// 网络广播注册
		imgDibbling.setOnFocusChangeListener(new OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					imgDibbling.setOnKeyListener(new OnKeyListener() {
						@Override
						public boolean onKey(View v, int keyCode, KeyEvent event) {
							if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
									&& event.getAction() == KeyEvent.ACTION_DOWN) {
								handler.post(new Runnable() {
									@Override
									public void run() {
										scrollView
												.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
										imgStore.requestFocus();
									}
								});
								return true;
							}
							return false;
						}
					});
				}
			}
		});

		imgStore.setOnFocusChangeListener(new OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					imgStore.setOnKeyListener(new OnKeyListener() {
						@Override
						public boolean onKey(View v, int keyCode, KeyEvent event) {
							if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
									&& event.getAction() == KeyEvent.ACTION_DOWN) {
								handler.post(new Runnable() {
									@Override
									public void run() {
										scrollView
												.fullScroll(HorizontalScrollView.FOCUS_LEFT);
										imgDibbling.requestFocus();
									}
								});
								return true;
							}
							return false;
						}
					});
				}
			}
		});

		imgMyApplication.setOnFocusChangeListener(new OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					imgMyApplication.setOnKeyListener(new OnKeyListener() {
						@Override
						public boolean onKey(View v, int keyCode, KeyEvent event) {
							if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
									&& event.getAction() == KeyEvent.ACTION_DOWN) {
								handler.post(new Runnable() {
									@Override
									public void run() {
										scrollView
												.fullScroll(HorizontalScrollView.FOCUS_LEFT);
										imgDibbling.requestFocus();
									}
								});
								return true;
							}
							return false;
						}
					});
				}
			}
		});
	}

	/**
	 * 初始化控件
	 */
	private void initView() {
		imginternet = (ImageView) findViewById(R.id.imginternet);
		imgLive = (ImageView) findViewById(R.id.imglive);
		imgLookback = (ImageView) findViewById(R.id.imglookback);
		imgDibbling = (ImageView) findViewById(R.id.imgdibbling);
		imgStore = (ImageView) findViewById(R.id.imgstore);
		imgMyApplication = (ImageView) findViewById(R.id.imgmyapplication);
		imgPlay = (ImageView) findViewById(R.id.imgplay);
		imgSetting = (ImageView) findViewById(R.id.imgsetting);
		tvTime = (TimeTextView) findViewById(R.id.tvtime);
		scrollView = (HorizontalScrollView) findViewById(R.id.srcollView);
		handler = new Handler();
	}

	/**
	 * 跳转到其他apk
	 * 
	 * @param context
	 * @param packageChar
	 * @param classChar
	 * @param extras
	 */
	private void startOtherApk(Context context, String packageChar,
			String classChar, Bundle extras) {
		try {
			Log.i("yexiong", "startOtherApk");
			ComponentName componentName = new ComponentName(packageChar,
					classChar);
			Intent intent = new Intent();
			if (null != extras) {
				intent.putExtras(extras);
			}
			intent.setComponent(componentName);
			context.startActivity(intent);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	ServiceConnection connection = new ServiceConnection() {
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			iMyService = null;
			Log.i("yexiong", "		ServiceDisconnected");
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			// 得到本地代理对象
			Log.i("yexiong", "		ServiceConnected");
			iMyService = IMyService.Stub.asInterface(service);
//			try {
//
//			} catch (RemoteException exception) {
//				exception.printStackTrace();
//			}
		}
	};
	public static void setSystemProperty(String key, String value) {
		try {
			Class<?> clazz = Class.forName("android.os.SystemProperties");
			Method get = clazz.getMethod("set", String.class, String.class);
			get.invoke(null, key, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.imglive:// 電視直播
			try {
				setSystemProperty("persist.sys.repeatdelay","70");
				Intent intent = this.getPackageManager()
						.getLaunchIntentForPackage("com.ott.live.webhost");
				intent.putExtra("type", 0);
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
//				SysUtils.setSystemProperty("mstar.keep.lastframe","1");
			} catch (Exception e) {
				Log.i("yexiong", "imglive exception");
				Toast.makeText(this, "没有安装", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.imglookback:// 電視回看
			try {
				Intent intent = this.getPackageManager()
						.getLaunchIntentForPackage("com.shandong.shandonglive");
				intent.putExtra("type", 2);
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
//				SysUtils.setSystemProperty("mstar.keep.lastframe","0");
			} catch (Exception e) {
				Log.i("yexiong", "imglookback exception");
				Toast.makeText(this, "没有安装", Toast.LENGTH_LONG).show();
			}

			break;
		case R.id.imgdibbling:// 视频点播
			setSystemProperty("persist.sys.repeatdelay","100");
			
			startOtherApk(HomeActivity.this, "com.shandong.vod",
					"com.shandong.vod.ui.activity.SplashActivity", null);
//			Intent intent2 = new Intent("com.wasu.openpage");
//			try {
//				startActivity(intent2);
//			} catch (Exception e) {
//				Log.i("yexiong", "exception ");
//			}
			break;
		case R.id.imgstore:// 应用商店
//			Toast.makeText(getApplicationContext(), "系统升级中，暂不提供服务", 0).show();
			Intent intent = new Intent();
			intent.setAction("com.ott.plugin.service.IMyService");
			bindService(intent, connection, Context.BIND_AUTO_CREATE);// 綁定aidl
			Bundle bundle1 = new Bundle();
			bundle1.putString("spid", "990080");
//			intent.putExtras(bundle1);
//			ComponentName cn1 = new ComponentName("com.ihome.android.market2",
//					"om.ihome.android.market2.InitialActivity");
//			intent.setComponent(cn1);
//			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//			startActivity(intent);
			startOtherApk(HomeActivity.this, "com.ihome.android.market2",
					"com.ihome.android.market2.InitialActivity", bundle1);
			break;
		case R.id.imgmyapplication:// 我的应用
//			Toast.makeText(getApplicationContext(), "系统升级中，暂不提供服务", 0).show();
			
			startOtherApk(HomeActivity.this, "com.ipanel.join.launcher.dl",
					"tv.ipanel.android.shanxi.myapphome.MyAppActivity", null);

			break;
		case R.id.imgplay:// 本地播放
			startOtherApk(HomeActivity.this, "com.ihome.android.localMedia",
					"com.ihome.android.localMedia.MediaShow", null);
			break;
		case R.id.imgsetting:// 系统设置
			startOtherApk(HomeActivity.this, "com.android.settingsEx",
					"com.android.settings.SettingsActivity", null);
			break;
		}
	}

	private NetworkInfo netInfo;
	private ConnectivityManager mConnectivityManager;  

	//监听网络状态变化的广播接收器

	private BroadcastReceiver myNetReceiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {

			String action = intent.getAction();
			if (action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {

				mConnectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
				netInfo = mConnectivityManager.getActiveNetworkInfo();
				
				if (netInfo != null && netInfo.isAvailable()) {
					if (netInfo.getType() == ConnectivityManager.TYPE_WIFI) {
						imginternet.setImageResource(R.drawable.icon24);
					} else if (netInfo.getType() == ConnectivityManager.TYPE_ETHERNET) {
						imginternet.setImageResource(R.drawable.icon20);	
					} else if (netInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
						imginternet.setImageResource(R.drawable.icon25);
					}
				} else {
					imginternet.setImageResource(R.drawable.icon21);
				}
			}

		}
	};

	private void bind() {
	       IntentFilter mFilter = new IntentFilter();  
	       mFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);  
	       registerReceiver(myNetReceiver, mFilter);  
	}

	private void unbind() {
	    if(myNetReceiver!=null)
            unregisterReceiver(myNetReceiver);  
            myNetReceiver = null;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		unbind();
		unbindService(connection);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
