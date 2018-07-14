package com.winson.ccbnhotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enter();
            }
        });

    }

    private void enter(){
        Intent intent = new Intent(this, HotelHomeActivity.class);
        startActivity(intent);
        finish();
    }
}
