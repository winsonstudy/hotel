package com.shangdong.hotel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.Calendar;

/**
 * Created by Winson on 2018/6/30.
 */
public class SplashActivity extends BaseActivity {

    public static final String TAG = SplashActivity.class.getSimpleName();

    Handler mHandler;
    Runnable mRunnable;

    String day, month;
    String monday, tuesday, wednesday, thursday, friday, saturday, sunday;

    TextView timeTV, dateTV, weekTV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        day = getResources().getString(R.string.day);
        month = getResources().getString(R.string.month);
        monday = getResources().getString(R.string.monday);
        tuesday = getResources().getString(R.string.tuesday);
        wednesday = getResources().getString(R.string.wednesday);
        thursday = getResources().getString(R.string.thursday);
        friday = getResources().getString(R.string.friday);
        saturday = getResources().getString(R.string.saturday);
        sunday = getResources().getString(R.string.sunday);

        timeTV = findViewById(R.id.time);
        dateTV = findViewById(R.id.date);
        weekTV = findViewById(R.id.week);

        boolean isNormal = getIntent().getBooleanExtra("noraml", false);
        DisplayMetrics dm = getResources().getDisplayMetrics();
//        Toast.makeText(this, "width : " + dm.widthPixels + " , height : " + dm.heightPixels +" , dp : " + dm.density, Toast.LENGTH_LONG).show();
        Log.d("Tag", "width : " + dm.widthPixels + " , height : " + dm.heightPixels + " , dp : " + dm.density);//, Toast.LENGTH_SHORT).show();
        mHandler = new Handler(Looper.getMainLooper());
        if (!isNormal) {
//            mRunnable = new Runnable() {
//                @Override
//                public void run() {
//                    selectMode();
//                }
//            };
//            mHandler.postDelayed(mRunnable, 1000);
        }

//        findViewById(R.id.logo).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                jumpOne();
//            }
//        });

        findViewById(R.id.sure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpOne();
            }
        });

        refreshDate();
        mHandler.postDelayed(dateRefreshRun, 500);

    }

    Runnable dateRefreshRun = new Runnable() {
        @Override
        public void run() {
            refreshDate();
            mHandler.postDelayed(dateRefreshRun, 500);
        }
    };

    private void refreshDate() {
        Calendar c = Calendar.getInstance();
        dateTV.setText("" + ((c.get(Calendar.MONTH) + 1) % 12) + month + c.get(Calendar.DAY_OF_MONTH) + day);
        int week = c.get(Calendar.DAY_OF_WEEK);
        switch (week) {
            case 1:
                weekTV.setText(sunday);
                break;
            case 2:
                weekTV.setText(monday);
                break;
            case 3:
                weekTV.setText(tuesday);
                break;
            case 4:
                weekTV.setText(wednesday);
                break;
            case 5:
                weekTV.setText(thursday);
                break;
            case 6:
                weekTV.setText(friday);
                break;
            case 7:
                weekTV.setText(saturday);
                break;
            default:
                weekTV.setText(monday);
        }

        String hour = String.format("%02d", c.get(Calendar.HOUR_OF_DAY));
        String minute = String.format("%02d", c.get(Calendar.MINUTE));
        String second = String.format("%02d", c.get(Calendar.SECOND));

        timeTV.setText(hour + ":" + minute + ":" + second);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacks(mRunnable);
        mHandler.removeCallbacks(dateRefreshRun);
    }

    private void selectMode() {
        new MaterialDialog.Builder(this)
                .title(R.string.choice_mode)
                .items(R.array.mode_list)
                .itemsCallbackSingleChoice(0, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
//                                showToast(which + ": " + text);
//                        Toast.makeText(view.getContext(), which + ": " + text, Toast.LENGTH_SHORT).show();
                        if (which == 0) {
                            jumpOne();
                        } else {
                            jumpTWO();
                        }
                        return true; // allow selection
                    }
                })
                .positiveText(R.string.md_choose_label)
                .cancelable(false)
                .show();
    }

    private void jumpOne() {
//        startActivity(new Intent(this, LauncherOneActivity.class));
        startActivity(new Intent(this, DemoActivity.class));
//        startActivity(new Intent(this, TestActivity.class));
        finish();
    }

    private void jumpTWO() {
//        startActivity(new Intent(this, LauncherTwoActivity.class));
        startActivity(new Intent(this, DemoActivity.class));
//        startActivity(new Intent(this, TestActivity.class));
        finish();
    }

}
