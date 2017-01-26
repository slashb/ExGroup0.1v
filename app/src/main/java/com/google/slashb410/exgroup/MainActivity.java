package com.google.slashb410.exgroup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.slashb410.exgroup.ui.IntroActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                    // onClickScreen(null);
                } catch (Exception e) {
                }
            }
        }).start();

        goNextActivity();

    }


    public void goNextActivity(){
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
        finish();
    }

}
