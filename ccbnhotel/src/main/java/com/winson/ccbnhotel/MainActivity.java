package com.winson.ccbnhotel;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    TextView timeTv, dateTv;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();

        timeTv = findViewById(R.id.time);
        dateTv = findViewById(R.id.date);

        updateTime();
        handler.postDelayed(timeRunnable, 500);

        findViewById(R.id.travel_service).setFocusableInTouchMode(true);
        findViewById(R.id.travel_service).requestFocus();
        findViewById(R.id.test).requestFocus();
        findViewById(R.id.travel_service).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Log.d(TAG, "onFocusChange ---> " + view + " , b : " + b);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(timeRunnable);
    }

    Runnable timeRunnable = new Runnable() {
        @Override
        public void run() {
            updateTime();
            handler.postDelayed(timeRunnable, 500);
        }
    };

    public void updateTime() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        timeTv.setText(String.format("%02d:%02d", hour, minute));
        dateTv.setText(String.format("%d/%02d/%02d", year, month, day));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {

        }
    }
}
