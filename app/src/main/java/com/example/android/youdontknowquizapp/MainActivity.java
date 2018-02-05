package com.example.android.youdontknowquizapp;


import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.DigestOutputStream;


public class MainActivity extends AppCompatActivity {
    int finalScore = 0;

    String userName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //    When the Hit me button is clicked this function is fired
    private int submitQuiz() {
//        Answer for first question
        RadioButton india1 = (RadioButton) findViewById(R.id.india1);
        boolean isIndia1 = india1.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia1));
        //Answer for second question
        CheckBox india2 = (CheckBox) findViewById(R.id.india2);
        boolean isIndia2 = india2.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia2));
        CheckBox india3 = (CheckBox) findViewById(R.id.india3);
        boolean isIndia3 = india3.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia3));
//        Answer for third question
        RadioButton india4 = (RadioButton) findViewById(R.id.india4);
        boolean isIndia4 = india4.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia4));
//        Answer for forth question
        RadioButton india5 = (RadioButton) findViewById(R.id.india5);
        boolean isIndia5 = india5.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia5));
//        Answer for fifth question
        RadioButton india6 = (RadioButton) findViewById(R.id.india6);
        boolean isIndia6 = india6.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia6));
//        Answer for sixth question
        RadioButton india7 = (RadioButton) findViewById(R.id.india7);
        boolean isIndia7 = india7.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia3));
//        Answer for seventh question
        RadioButton india8 = (RadioButton) findViewById(R.id.india8);
        boolean isIndia8 = india8.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia8));
//        Answer for eighth question
        RadioButton india9 = (RadioButton) findViewById(R.id.india9);
        boolean isIndia9 = india9.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia9));
//        Answer for nineth question
        RadioButton india10 = (RadioButton) findViewById(R.id.india10);
        boolean isIndia10 = india10.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia10));
//        Answer for the last question of the quiz
        RadioButton india11 = (RadioButton) findViewById(R.id.india11);
        boolean isIndia11 = india11.isChecked();
        Log.v("MainActivity", "IS true: " + Boolean.toString(isIndia11));

        int finalScore = 0;

        if (isIndia1) {
            finalScore = finalScore + 1;
        } else {
            india1.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia2 && isIndia3) {
            finalScore = finalScore + 1;
        } else {
            india2.setTextColor(getResources().getColor(R.color.green));
            india3.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia4) {
            finalScore = finalScore + 1;
        } else {
            india4.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia5) {
            finalScore = finalScore + 1;
        } else {
            india5.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia6) {
            finalScore = finalScore + 1;
        } else {
            india6.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia7) {
            finalScore = finalScore + 1;
        } else {
            india7.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia8) {
            finalScore = finalScore + 1;
        } else {
            india8.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia9) {
            finalScore = finalScore + 1;
        } else {
            india9.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia10) {
            finalScore = finalScore + 1;
        } else {
            india10.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndia11) {
            finalScore = finalScore + 1;
        } else {
            india11.setTextColor(getResources().getColor(R.color.green));
        }
        return finalScore;
    }

    public void showScore(View view) {
        finalScore = submitQuiz();
        display(finalScore);
    }

    private void display(int score) {
        EditText nameField = (EditText) findViewById(R.id.edit_text_view);
        userName = nameField.getText().toString();

        if (finalScore == 10) {
            TextView scoreTextView = (TextView) findViewById(R.id.summary_message);
            scoreTextView.setText("WooHoo " + userName +  "\n You know more things about India than you knew before this quiz" + "\nScore: " + finalScore + "/10");
            Toast.makeText(this, "Thank you for completing the quiz", Toast.LENGTH_SHORT).show();
        } else {
            TextView scoreTextView2 = (TextView) findViewById(R.id.summary_message);
            scoreTextView2.setText("Look for the green highlights " + userName + "\nYou can solve this");
        }

    }


    public void resetQuiz (View v) {

//        Reset button color
        RadioButton india1 = (RadioButton) findViewById(R.id.india1);
        india1.setTextColor(getResources().getColor(R.color.black));

        RadioButton india4 = (RadioButton) findViewById(R.id.india4);
        india4.setTextColor(getResources().getColor(R.color.black));

        RadioButton india5 = (RadioButton) findViewById(R.id.india5);
        india5.setTextColor(getResources().getColor(R.color.black));

        RadioButton india6 = (RadioButton) findViewById(R.id.india6);
        india6.setTextColor(getResources().getColor(R.color.black));

        RadioButton india7 = (RadioButton) findViewById(R.id.india7);
        india7.setTextColor(getResources().getColor(R.color.black));

        RadioButton india8 = (RadioButton) findViewById(R.id.india8);
        india8.setTextColor(getResources().getColor(R.color.black));

        RadioButton india9 = (RadioButton) findViewById(R.id.india9);
        india9.setTextColor(getResources().getColor(R.color.black));

        RadioButton india10 = (RadioButton) findViewById(R.id.india10);
        india10.setTextColor(getResources().getColor(R.color.black));

        RadioButton india11 = (RadioButton) findViewById(R.id.india11);
        india11.setTextColor(getResources().getColor(R.color.black));


//        Reset button check
        RadioGroup radioGroup00 = (RadioGroup) findViewById(R.id.radio_group00);
        radioGroup00.clearCheck();


        RadioGroup radioGroup01 = (RadioGroup) findViewById(R.id.radio_group01);
        radioGroup01.clearCheck();

        RadioGroup radioGroup02 = (RadioGroup) findViewById(R.id.radio_group02);
        radioGroup02.clearCheck();

        RadioGroup radioGroup03 = (RadioGroup) findViewById(R.id.radio_group03);
        radioGroup03.clearCheck();

        RadioGroup radioGroup04 = (RadioGroup) findViewById(R.id.radio_group04);
        radioGroup04.clearCheck();

        RadioGroup radioGroup05 = (RadioGroup) findViewById(R.id.radio_group05);
        radioGroup05.clearCheck();

        RadioGroup radioGroup06 = (RadioGroup) findViewById(R.id.radio_group06);
        radioGroup06.clearCheck();

        RadioGroup radioGroup07 = (RadioGroup) findViewById(R.id.radio_group07);
        radioGroup07.clearCheck();

        RadioGroup radioGroup08 = (RadioGroup) findViewById(R.id.radio_group08);
        radioGroup08.clearCheck();



        CheckBox checkBox = (CheckBox) findViewById(R.id.india2);
        checkBox.setChecked(false);
        checkBox.setTextColor(getResources().getColor(R.color.green));


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.india3);
        checkBox1.setChecked(false);
        checkBox.setTextColor(getResources().getColor(R.color.green));

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.indiaNull);
        checkBox2.setChecked(false);



        TextView textView = (TextView) findViewById(R.id.summary_message);
        textView.setText("Score");


    }

}
