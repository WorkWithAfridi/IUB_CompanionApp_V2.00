package com.kyotobytes.iubca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private TextView kyotobytes;
    private Typeface typeface;
    //private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        setter();
        setFont();
        startProgressBar();
    }
    private void startProgressBar(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                go();
            }
        });
        thread.start();
    }
    private void go(){
        for(int i=0; i<=100; i++){
            try{
                Thread.sleep(20);
               // progressBar.setProgress(i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        startActivity(new Intent(SplashScreen.this, Home.class));
        finish();
    }

    private void setter(){
        kyotobytes=(TextView)findViewById(R.id.kyotobytes);
//        progressBar=(ProgressBar)findViewById(R.id.progressBar);
    }
    private void setFont(){
        typeface=Typeface.createFromAsset(getAssets(),"fonts/montserrat_regular.otf");
        kyotobytes.setTypeface(typeface);
    }
}

//Progressbar xml code
//
//<ProgressBar
//        android:id="@+id/progressBar"
//                style="?android:attr/progressBarStyleHorizontal"
//                android:layout_width="match_parent"
//                android:layout_height="5dp"
//                android:layout_marginBottom="404dp"
//                android:progressTint="@color/black"
//                app:layout_constraintBottom_toBottomOf="parent"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintHorizontal_bias="0.0"
//                app:layout_constraintStart_toStartOf="parent" />