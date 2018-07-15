package com.winson.ccbnhotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    View test;
    boolean onFocus;
    View content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test = findViewById(R.id.test);
        content = findViewById(R.id.content);

        findViewById(R.id.enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                enter();
                content.setScaleX(1.15f);
                content.setScaleY(1.15f);

            }
        });



    }

    private void enter(){
        Intent intent = new Intent(this, HotelHomeActivity.class);
        startActivity(intent);
        finish();
    }
}
