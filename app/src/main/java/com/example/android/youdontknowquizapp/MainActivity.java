package com.example.android.youdontknowquizapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int finalScore = 0;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    //    This method counts the answers
    private int submitQuiz() {
//        Answer for first question
        RadioButton india1 = (RadioButton) findViewById(R.id.india1);
        boolean isIndia1 = india1.isChecked();
        //Answer for second question
        CheckBox india2 = (CheckBox) findViewById(R.id.india2);
        boolean isIndia2 = india2.isChecked();
        CheckBox india3 = (CheckBox) findViewById(R.id.india3);
        boolean isIndia3 = india3.isChecked();
        CheckBox indiaNull = (CheckBox) findViewById(R.id.indiaNull);
        boolean isIndiaNull = indiaNull.isChecked();
//        Answer for third question
        RadioButton india4 = (RadioButton) findViewById(R.id.india4);
        boolean isIndia4 = india4.isChecked();
//        Answer for forth question
        RadioButton india5 = (RadioButton) findViewById(R.id.india5);
        boolean isIndia5 = india5.isChecked();
//        Answer for fifth question
        RadioButton india6 = (RadioButton) findViewById(R.id.india6);
        boolean isIndia6 = india6.isChecked();
//        Answer for sixth question
        RadioButton india7 = (RadioButton) findViewById(R.id.india7);
        boolean isIndia7 = india7.isChecked();
//        Answer for seventh question
        RadioButton india8 = (RadioButton) findViewById(R.id.india8);
        boolean isIndia8 = india8.isChecked();
//        Answer for eighth question
        RadioButton india9 = (RadioButton) findViewById(R.id.india9);
        boolean isIndia9 = india9.isChecked();
//        Answer for nineth question
        RadioButton india10 = (RadioButton) findViewById(R.id.india10);
        boolean isIndia10 = india10.isChecked();
//        Answer for the tenth question of the quiz
        RadioButton india11 = (RadioButton) findViewById(R.id.india11);
        boolean isIndia11 = india11.isChecked();
//        Answer for the eleventh question of the quiz
        EditText capital = (EditText) findViewById(R.id.capital);
        String getCapital = capital.getText().toString();

        int finalScore = 0;

        if (isIndia1) {
            finalScore = finalScore + 1;
        } else {
            india1.setTextColor(getResources().getColor(R.color.green));
        }

        if (isIndiaNull) {
            india2.setTextColor(getResources().getColor(R.color.green));
            india3.setTextColor(getResources().getColor(R.color.green));
        } else if (isIndia2 && isIndia3) {
            finalScore = finalScore + 1;
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

        if (getCapital.equals("New Delhi")) {
            finalScore = finalScore + 1;
        } else {
            capital.setTextColor(getResources().getColor(R.color.green));
        }
        return finalScore;
    }

    //    This method is fired when the "Hit me" button is clicked
    public void showScore(View view) {

        finalScore = submitQuiz();
        display(finalScore);
    }

    //      This method displays the score message
    private void display(int score) {
        EditText nameField = (EditText) findViewById(R.id.edit_text_view);
        userName = nameField.getText().toString();

        if (userName.length() == 0) {
            Toast.makeText(this, "Please insert your name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (finalScore == 11) {
            TextView scoreTextView = (TextView) findViewById(R.id.summary_message);
            scoreTextView.setText(getString(R.string.wooHoo, userName) +
                    getString(R.string.you) +
                    getString(R.string.message_score, finalScore) +
                    getString(R.string.ten_of_ten));
            Toast.makeText(this, getString(R.string.firstToast), Toast.LENGTH_SHORT).show();
        } else {
            TextView scoreTextView2 = (TextView) findViewById(R.id.summary_message);
            scoreTextView2.setText(getString(R.string.notCompletedMessage, userName) +
                    getString(R.string.youcansolvethis) +
                    getString(R.string.your_score, finalScore));
        }


    }


    public void resetQuiz(View v) {

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

//          Reset the checkboxes
        CheckBox checkBox = (CheckBox) findViewById(R.id.india2);
        checkBox.setChecked(false);
        checkBox.setTextColor(getResources().getColor(R.color.green));

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.india3);
        checkBox1.setChecked(false);
        checkBox.setTextColor(getResources().getColor(R.color.green));

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.indiaNull);
        checkBox2.setChecked(false);

//          Reset summary message
        TextView textView = (TextView) findViewById(R.id.summary_message);
        textView.setText(R.string.score);

//        Reset EditText value
        EditText nameField = (EditText) findViewById(R.id.edit_text_view);
        nameField.setText(null);

//        Reset question eleven
        EditText capital = (EditText) findViewById(R.id.capital);
        capital.setText(null);


    }

}
