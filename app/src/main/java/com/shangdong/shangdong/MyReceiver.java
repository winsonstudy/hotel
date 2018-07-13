package com.shangdong.shangdong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Winson on 2018/7/13.
 */
public class MyReceiver extends BroadcastReceiver {

    public static final String action = "com.winson.action";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Toast.makeText(context, "get action : " + action, Toast.LENGTH_SHORT).show();



    }

}
