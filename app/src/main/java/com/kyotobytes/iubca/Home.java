package com.kyotobytes.iubca;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.internal.MapLifecycleDelegate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Home extends AppCompatActivity {
    private Typeface typeface;
    private TextView AppName;
    private TextView devName;
    private TextView date;
    private TextView time;
    private TextView dateTimeHeader;

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t6;
    private TextView t7;
    private TextView t8;
    private TextView t9;
    private TextView t10;
    private TextView t11;
    private TextView t12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setter();
        setFont();
        setDateAndTime();
        //Toast.makeText(this, "Just letting you know,\nTHIS IS AN UNOFFICIAL APP. :)", Toast.LENGTH_LONG).show();
    }

    private void setDateAndTime() {
        Calendar calendar=Calendar.getInstance();
        Date todayIs = calendar.getTime();
        date.setText(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(todayIs.getTime()));

        DateFormat df = new SimpleDateFormat("h:mm a");
        time.setText(df.format(Calendar.getInstance().getTime()));
    }

    private void setFont() {
        AppName.setTypeface(typeface);
        date.setTypeface(typeface);
        time.setTypeface(typeface);
        typeface= Typeface.createFromAsset(getAssets(),"fonts/montserrat_regular.otf");
        devName.setTypeface(typeface);
        dateTimeHeader.setTypeface(typeface);

//        t1=findViewById(R.id.text1);
//        t2=findViewById(R.id.text2);
//        t3=findViewById(R.id.text3);
//        t4=findViewById(R.id.text4);
//        t5=findViewById(R.id.text5);
//        t6=findViewById(R.id.text6);
//        t7=findViewById(R.id.text7);
//        t8=findViewById(R.id.text8);
//        t9=findViewById(R.id.text9);
//        t10=findViewById(R.id.text10);
//        t11=findViewById(R.id.text11);
//        t12=findViewById(R.id.text12);
//
//        t1.setTypeface(typeface);
//        t2.setTypeface(typeface);
//        t3.setTypeface(typeface);
//        t4.setTypeface(typeface);
//        t5.setTypeface(typeface);
//        t6.setTypeface(typeface);
//        t7.setTypeface(typeface);
//        t8.setTypeface(typeface);
//        t9.setTypeface(typeface);
//        t10.setTypeface(typeface);
//        t11.setTypeface(typeface);
//        t12.setTypeface(typeface);
    }

    private void setter(){
        AppName=findViewById(R.id.appName);
        devName=findViewById(R.id.dev);
        date=findViewById(R.id.date);
        time=findViewById(R.id.time);
        dateTimeHeader=findViewById(R.id.dateTimeHeader);
        typeface= Typeface.createFromAsset(getAssets(),"fonts/montserrat_bold.otf");
    }

    public void OpenLibrary(View view) {
        startActivity(new Intent(Home.this, Library.class));
    }

    public void OpenIras(View view) {
        startActivity(new Intent(Home.this, Iras.class));
    }

    public void OpenWebsite(View view) {
        startActivity(new Intent(Home.this, OfficialWebsite.class));
    }

    public void OpenDevWebsite(View view) {
        startActivity(new Intent(Home.this, DevWebsite.class));
    }

    public void OpenIubAtAGlance(View view) {
        startActivity(new Intent(Home.this, IubAtAGlance.class));
    }

    public void OpenFindMyClassroom(View view) {
        startActivity(new Intent(Home.this, FindMyClassRoom.class));
    }

    public void OpenGoogleMaps(View view) {
        startActivity(new Intent(Home.this, GoogleMaps.class));
    }

    public void OpenBBA(View view) {
        startActivity(new Intent(Home.this, SchoolOfBusiness.class));
    }

    public void OpenCSE(View view) {
        startActivity(new Intent(Home.this, DeptOfCSE.class));
    }

    public void OpenEEE(View view) {
        startActivity(new Intent(Home.this, DeptOfEEE.class));
    }

    public void CalculateCGPA(View view) {
        startActivity(new Intent(Home.this, CgpaCalculator.class));
    }

    public void OpenMediaAndComm(View view) {
        startActivity(new Intent(Home.this, MediaAndComm.class));
    }

    public void OpenLifeScience(View view) {
        startActivity(new Intent(Home.this, LifeScience.class));
    }

    public void OpenEnv(View view) {
        startActivity(new Intent(Home.this, EnvSci.class));
    }

    public void OpenLaw(View view) {
        startActivity(new Intent(Home.this, Law.class));
    }

    public void OpenEnglish(View view) {
        startActivity(new Intent(Home.this, English.class));
    }

    public void OpenQuickLinks(View view) {
        startActivity(new Intent(Home.this, QuickLinks.class));
    }

    public void needHelpOnClick(View view) {
        startActivity(new Intent(Home.this, needHelp.class));
    }
}