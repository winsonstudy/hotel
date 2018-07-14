package com.shangdong.hotel;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Winson on 2018/7/9.
 */
public class DemoActivity extends AppCompatActivity {

    ImageView imginternet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.demo_layout);

        imginternet = findViewById(R.id.imginternet);

        findViewById(R.id.imglive).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("com.ott.live.webhost");
            }
        });

        System.out.println("This is my first app!");

        findViewById(R.id.imglookback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("com.winson.test");
            }
        });

        findViewById(R.id.imgdibbling).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("com.winson.test");
            }
        });

        findViewById(R.id.imgplay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("com.winson.test");
            }
        });

        findViewById(R.id.imgsetting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Settings.ACTION_SETTINGS);
                startActivity(mIntent);
            }
        });

        updateConnectInfo();

        IntentFilter mFilter = new IntentFilter();
        mFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myNetReceiver, mFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (myNetReceiver != null) {
            unregisterReceiver(myNetReceiver);
            myNetReceiver = null;
        }

    }

    private void openApp(String packageName) {
        PackageManager packageManager = getPackageManager();
        // TODO
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
        } else {
            Toast.makeText(DemoActivity.this, getResources().getString(R.string.not_install_app), Toast.LENGTH_SHORT).show();
        }
    }

    private BroadcastReceiver myNetReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {

            String action = intent.getAction();
            if (action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {

                updateConnectInfo();
            }

        }
    };

    private void updateConnectInfo() {
        ConnectivityManager mConnectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = mConnectivityManager.getActiveNetworkInfo();

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
