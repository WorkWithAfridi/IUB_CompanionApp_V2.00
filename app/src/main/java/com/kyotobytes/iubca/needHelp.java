package com.kyotobytes.iubca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class needHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_help);
    }

    public void BackToHomeScreen(View view) {
        startActivity(new Intent(needHelp.this, Home.class));
        finish();
    }
}