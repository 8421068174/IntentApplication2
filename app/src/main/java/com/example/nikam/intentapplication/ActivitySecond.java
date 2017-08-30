package com.example.nikam.intentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_second);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            String rec = bundle.getString("S1");
        }

    }
}
