package com.kyotobytes.iubca;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Type;

public class CgpaCalculator extends AppCompatActivity {
    private EditText course1;
    private EditText course2;
    private EditText course3;
    private EditText course4;
    private EditText course5;
    private EditText course6;
    private EditText course7;
    private EditText course8;
    private Button calculate;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculator);
        setter();
        setFont();
    }

    private void setFont() {
        Typeface typeface= Typeface.createFromAsset(getAssets(),"fonts/montserrat_regular.otf");
        tv1.setTypeface(typeface);
        tv2.setTypeface(typeface);
        tv3.setTypeface(typeface);
        course1.setTypeface(typeface);
        course2.setTypeface(typeface);
        course3.setTypeface(typeface);
        course4.setTypeface(typeface);
        course5.setTypeface(typeface);
        course6.setTypeface(typeface);
        course7.setTypeface(typeface);
        course8.setTypeface(typeface);
    }

    private void setter() {
        course1=findViewById(R.id.courseOne);
        course2=findViewById(R.id.courseTwo);
        course3=findViewById(R.id.courseThree);
        course4=findViewById(R.id.courseFour);
        course5=findViewById(R.id.courseFive);
        course6=findViewById(R.id.courseSix);
        course7=findViewById(R.id.courseSeven);
        course8=findViewById(R.id.courseEight);
        calculate=findViewById(R.id.calculate);
        tv1=findViewById(R.id.text1);
        tv2=findViewById(R.id.text2);
        tv3=findViewById(R.id.text3);
    }

    public void Calculate(View view) {
        String grade1=course1.getText().toString().toLowerCase();
        String grade2=course2.getText().toString().toLowerCase();
        String grade3=course3.getText().toString().toLowerCase();
        String grade4=course4.getText().toString().toLowerCase();
        String grade5=course5.getText().toString().toLowerCase();
        String grade6=course6.getText().toString().toLowerCase();
        String grade7=course7.getText().toString().toLowerCase();
        String grade8=course8.getText().toString().toLowerCase();
        double sum=0;
        int count=0;
        String[] ArrayOfGrades={grade1, grade2,grade3,grade4,grade5,grade6,grade7,grade8};
        for(String grade : ArrayOfGrades){
            if(grade.equals("") || grade.equals("p") || grade.equals("r") || grade.equals("i") || grade.equals("w") || grade.equals("s") || grade.equals("u") || grade.equals("o") || grade.equals("y") || grade.equals("z")){
                continue;
            }else{
                double point=getScore(grade);
                sum+=point;
                count++;
            }
        }
        double total=0.0;
        total=sum/count;
        tv3.setText("Your CGPA for this semester could be: \n"+total+" (+/- 0.3)");
    }

    private double getScore(String grade) {
        switch (grade){
            case "a": return 4.00;
            case "a-": return 3.7;
            case "b+": return 3.3;
            case "b": return 3.0;
            case "b-": return 2.7;
            case "c+": return 2.3;
            case "c": return 2.0;
            case "c-": return 1.7;
            case "d+": return 1.3;
            case "d": return 1.0;
            case "p": return 0;
            case "r": return 0;
            case "f": return 0;
            case "i": return 0;
            case "w": return 0;
            case "s": return 0;
            case "u": return 0;
            case "o": return 0;
            case "y": return 0;
            case "z": return 0;
            default: return 0;
        }
    }
}