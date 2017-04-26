package com.mobileappscompany.training.hw2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MAC_Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonPressed(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
}
