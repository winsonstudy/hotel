package com.shangdong.hotel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;

import anylife.scrolltextview.ScrollTextView;

/**
 * Created by Winson on 2018/6/28.
 */
public class LauncherOneActivity extends BaseActivity {


    int i = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_one);

        final ScrollTextView stv = (ScrollTextView) findViewById(R.id.title_scroll);
        findViewById(R.id.title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stv.setText("Welcome to kangmei : " + (++i));
            }
        });

    }

}
