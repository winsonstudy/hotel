package com.shangdong.hotel;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), LauncherOneActivity.class));
            }
        });

        findViewById(R.id.two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), LauncherTwoActivity.class));

            }
        });

        findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), SplashActivity.class);
//                intent.putExtra("noraml", true);
//                startActivity(intent);
                new MaterialDialog.Builder(view.getContext())
                        .title(R.string.choice_mode)
                        .items(R.array.mode_list)
                        .itemsCallbackSingleChoice(0, new MaterialDialog.ListCallbackSingleChoice() {
                            @Override
                            public boolean onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
//                                showToast(which + ": " + text);
                                Toast.makeText(view.getContext(), which + ": " + text, Toast.LENGTH_SHORT).show();

                                return true; // allow selection
                            }
                        })
                        .positiveText(R.string.md_choose_label)
                        .show();
//                new MaterialDialog.Builder(view.getContext())
//                        .title(R.string.choice_mode)
////                        .items(R.array.mode_list)
//                        .itemsCallback(new MaterialDialog.ListCallback() {
//                            @Override
//                            public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
//                                Toast.makeText(view.getContext(), which + ": " + text, Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .show();

            }
        });



    }


}
