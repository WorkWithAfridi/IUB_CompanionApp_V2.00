package com.kyotobytes.iubca;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FindMyClassRoom extends AppCompatActivity {
    private TextView result;
    private TextView sob;
    private TextView soe;
    private TextView soenv;
    private TextView sos;
    private TextView hacks;
    private EditText roomNumber;
    private Button search;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_my_class_room);
        setter();
        setfont();

        editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    search(v);
                    return true;
                }
                return false;
            }
        });
    }

    private void setfont() {
        Typeface typeface= Typeface.createFromAsset(getAssets(),"fonts/montserrat_regular.otf");
        result.setTypeface( typeface);
        sob.setTypeface( typeface);
        soe.setTypeface( typeface);
        soenv.setTypeface( typeface);
        sos.setTypeface( typeface);
        hacks.setTypeface( typeface);
        roomNumber.setTypeface(typeface);
        //search.setTypeface(typeface);
    }

    private void setter() {
        result=findViewById(R.id.result);
        sob=findViewById(R.id.SOB);
        soe=findViewById(R.id.SOE);
        soenv=findViewById(R.id.SOEnv);
        sos=findViewById(R.id.SOS);
        hacks=findViewById(R.id.hacks);
        roomNumber=findViewById(R.id.roomNumber);
        search=findViewById(R.id.search);
        editText=findViewById(R.id.roomNumber);
    }

    public void search(View view) {
        result=(TextView)findViewById(R.id.result);
        roomNumber=(EditText)findViewById(R.id.roomNumber);
        String room_number=roomNumber.getText().toString();
        String location=" ";
        if(room_number.equals("")||room_number.length()>8){
            result.setText("Please insert a valid room number");
            return;
        }
        else if(room_number.startsWith("J")||room_number.startsWith("j")||room_number.startsWith("BC")||room_number.startsWith("bc")){
            //textView.setText("Searching..");
            char[] ch=new char[room_number.length()];
            for(int i=0; i<room_number.length();i++){
                ch[i]=room_number.charAt(i);
            }
            if(room_number.startsWith("BC")||room_number.startsWith("bc")){
                String room_code=new String();
                for(int i=2; i<room_number.length(); i++){
                    room_code+=ch[i];
                }
//                textView.setText(room_code+" "+room_code.length()); return;
                int room_code_int=Integer.parseInt(room_code);
                if(room_code_int>0 && room_code_int<=1000){
                    location="Your classroom is located in \nLevel G, Ground Floor.";
                }else if(room_code_int>=1000 && room_code_int<2000){
                    location="Your classroom is located in \nSchool Of Business. \nLevel 1. Floor: 1.";
                }else if(room_code_int>=2000 && room_code_int<4000){
                    if(room_code_int>=2000 && room_code_int<3000){
                        location="Your classroom is located in \nSchool Of Business. \nLevel 2. Floor: 2.";
                    }else{
                        location="Your classroom is located in \nSchool Of Business. \nLevel 3. Floor: 2.";
                    }
                }else if(room_code_int>=4000 && room_code_int<6000){
                    if(room_code_int>=4000 && room_code_int<5000){
                        location="Your classroom is located in \nSchool Of Engineering. \nLevel 4. Floor: 4.";
                    }else{
                        location="Your classroom is located in \nSchool Of Engineering. \nLevel 5. Floor: 4.";
                    }
                }else if(room_code_int>=6000 && room_code_int<8000){
                    if(room_code_int>=2000 && room_code_int<3000){
                        location="Your classroom is located in \nSchool Of Sociology. \nLevel 6. Floor: 6.";
                    }else{
                        location="Your classroom is located in \nSchool Of Sociology. \nLevel 7. Floor: 6.";
                    }
                }else if(room_code_int>=8000 && room_code_int<10999){
                    if(room_code_int>=8000 && room_code_int<9000){
                        location="Your classroom is located in \nSchool Of Environment Science. \nLevel 8. Floor: 8.";
                    }else{
                        location="Your classroom is located in \nSchool Of Environment Science. \nLevel 9. Floor: 8.";
                    }
                }
                result.setText(location.toString());
                return;
            }
            else if(room_number.startsWith("J")||room_number.startsWith("j")){
                String room_code=new String();
                for(int i=1; i<room_number.length(); i++){
                    room_code+=ch[i];
                }
                int room_code_int=Integer.parseInt(room_code);
                if(room_code_int>0 && room_code_int<=1000){
                    location="Your classroom is located in \nFloor: 1 of new Building.";
                }else if(room_code_int>1000&&room_code_int<=2000){
                    location="Your classroom is located in\nFloor: 2 of new Building.";
                }else if(room_code_int>2000&&room_code_int<=3000){
                    location="Your classroom is located in\nFloor: 3 of new Building.";
                }else if(room_code_int>3000&&room_code_int<=4000){
                    location="Your classroom is located in\nFloor: 4 of new Building.";
                }else if(room_code_int>4000&&room_code_int<=5000){
                    location="Your classroom is located in\nFloor: 5 of new Building.";
                }else if(room_code_int>5000&&room_code_int<=6000){
                    location="Your classroom is located in \nFloor: 6 of new Building.";
                }else if(room_code_int>6000&&room_code_int<=7000){
                    location="Your classroom is located in \nFloor: 7 of new Building.";
                }else if(room_code_int>7000&&room_code_int<=8000){
                    location="Your classroom is located in \nFloor: 8 of new Building.";
                }else if(room_code_int>8000&&room_code_int<=9000){
                    location="Your classroom is located in \nFloor: 9 of new Building.";
                }else if(room_code_int>9000&&room_code_int<=10000){
                    location="Your classroom is located in \nFloor: 10 of new Building.";
                }
                result.setText(location.toString());
                return;
            }
        }else{
            result.setText("Please insert a valid room number");
        }
    }
    public void roomNumber_OnClick(View view){
        result=(TextView)findViewById(R.id.result);
        roomNumber=(EditText)findViewById(R.id.roomNumber);
        roomNumber.setHint("Enter room number... ex: BC9015");
        result.setText("Your classroom is located at....");
        roomNumber.setText("");
    }
}