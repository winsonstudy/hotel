package com.ihome.android.launcher2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.TextView;

public class TimeTextView extends TextView {
	
	private MyHandler mHandler;
	private TimeRunable mTimeRunable;
    private Context cext;
	public TimeTextView(Context context) {
		super(context);
		cext=context;
		initTimeView();
	}
		

	public TimeTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		cext=context;
		initTimeView();
	}

	public TimeTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		cext=context;
		initTimeView();
	}
	
	private void initTimeView(){
		mHandler=new MyHandler();
		mTimeRunable=new TimeRunable();
		mHandler.post(mTimeRunable);
		
	}
	
	@Override
	protected void onAttachedToWindow() {
		mHandler.removeCallbacks(mTimeRunable);
		mHandler.post(mTimeRunable);
		super.onAttachedToWindow();
	}
	
	
	@Override
	protected void onDetachedFromWindow() {
		mHandler.removeCallbacks(mTimeRunable);
		super.onDetachedFromWindow();
	}
	
	
	@SuppressLint("HandlerLeak")
	private class MyHandler extends Handler{
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			
		}
	}
	
	@SuppressLint("SimpleDateFormat")
	private class TimeRunable implements Runnable{

		@Override
		public void run() {
//			SimpleDateFormat dateformat = new SimpleDateFormat(
//					"yyyy/MM/dd HH:mm:ss");
//			String a = dateformat.format(new Date());
//			if(a != null && a.length() == 19){
//				a = a.substring(a.indexOf(" ") + 1) + '\n' + a.substring(0,a.indexOf(" "));
//			}
			Date currentTime = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
			String dateString = formatter.format(currentTime);
			long time = System.currentTimeMillis();
			final Calendar mCalendar = Calendar.getInstance();
			mCalendar.setTimeInMillis(time);
			int apm = mCalendar.get(Calendar.AM_PM);
			if (apm == 0) {
				TimeTextView.this.setText("ÉÏÎç" + " " + dateString);
			} else {
				TimeTextView.this.setText("ÏÂÎç" + " " + dateString);
			}
			mHandler.postDelayed(mTimeRunable, 1000);

		}
		
	} 

}
