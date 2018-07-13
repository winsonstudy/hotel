package com.shangdong.hotel;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Winson on 2018/6/30.
 */
public class BootBroadcastReceiver extends BroadcastReceiver {

    private static final String ACTION_BOOT = Intent.ACTION_BOOT_COMPLETED;

    static final String TAG = BootBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.d(TAG, "----------> onReceive , action : " + action);
//        if ("com.winson".equals(action)) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(action)) {
            Utils.recordBootTime();

//            Intent intent1 = new Intent(context, SplashActivity.class);
//            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent1);

            openApp(context, "com.shangdong.hotel");

        }

//        else if (Intent.ACTION_MEDIA_MOUNTED.equals(action)) {
//            Utils.recordMountedTime();
//        } else if (Intent.ACTION_MEDIA_UNMOUNTED.equals(action)) {
//            Utils.recordUnmountedTime();
//        }

//        context.startActivity(new Intent(context, MainActivity.class));

    }

    private void openApp(Context context, String packageName) {
        if (isAppRunning(context, packageName)) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        // TODO
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
        } else {
//            Toast.makeText(context, "no apps !", Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean isAppRunning(Context context, String packageName) {
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> list = am.getRunningTasks(100);
        if (list.size() <= 0) {
            return false;
        }
        for (ActivityManager.RunningTaskInfo info : list) {
            if (info.baseActivity.getPackageName().equals(packageName)) {
                return true;
            }
        }
        return false;
    }


}
