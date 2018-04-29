package com.example.android.youdontknowquizapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    //    This method counts the answers
    private int submitQuiz() {
//        Answer for first question
        RadioButton firstQuestionAnswer = (RadioButton) findViewById(R.id.india1);
        boolean isFirstQuestionAnswer = firstQuestionAnswer.isChecked();
        //Answer for second question
        CheckBox secondQuestionFirstAnswer = (CheckBox) findViewById(R.id.india2);
        boolean isSecondQuestionFirstAnswer = secondQuestionFirstAnswer.isChecked();
        CheckBox secondQuestionSecondAnswer = (CheckBox) findViewById(R.id.india3);
        boolean isSecondQuestionSecondAnswer = secondQuestionSecondAnswer.isChecked();
        CheckBox secondQuestionThirdAnswer = (CheckBox) findViewById(R.id.indiaNull);
        boolean isSecondQuestionThirdAnswer = secondQuestionThirdAnswer.isChecked();
//        Answer for third question
        RadioButton thirdQuestionAnswer = (RadioButton) findViewById(R.id.india4);
        boolean isThirdQuestionAnswer = thirdQuestionAnswer.isChecked();
//        Answer for forth question
        RadioButton fourthQuestionAnswer = (RadioButton) findViewById(R.id.india5);
        boolean isFourthQuestionAnswer = fourthQuestionAnswer.isChecked();
//        Answer for fifth question
        RadioButton fifthQuestionAnswer = (RadioButton) findViewById(R.id.india6);
        boolean isFifthQuestionAnswer = fifthQuestionAnswer.isChecked();
//        Answer for sixth question
        RadioButton sixthQuestionAnswer = (RadioButton) findViewById(R.id.india8);
        boolean isSixthQuestionAnswer = sixthQuestionAnswer.isChecked();
//        Answer for seventh question
        RadioButton seventhQuestionAnswer = (RadioButton) findViewById(R.id.india9);
        boolean isSeventhQuestionAnswer = seventhQuestionAnswer.isChecked();
//        Answer for eighth question
        RadioButton eighthQuestionAnswer = (RadioButton) findViewById(R.id.india10);
        boolean isEighthQuestionAnswer = eighthQuestionAnswer.isChecked();
//        Answer for the ninth question of the quiz
        RadioButton ninthQuestionAnswer = (RadioButton) findViewById(R.id.india11);
        boolean isNinthQuestionAnswer = ninthQuestionAnswer.isChecked();
//        Answer for the tenth question of the quiz
        EditText tenthQuestionAnswer = (EditText) findViewById(R.id.capital);
        String getTenthQuestionAnswer = tenthQuestionAnswer.getText().toString();

        int finalScore = 0;

        if (isFirstQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            firstQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isSecondQuestionThirdAnswer) {
            secondQuestionFirstAnswer.setTextColor(getResources().getColor(R.color.green));
            secondQuestionSecondAnswer.setTextColor(getResources().getColor(R.color.green));
        } else if (isSecondQuestionFirstAnswer && isSecondQuestionSecondAnswer) {
            finalScore = finalScore + 1;
        }

        if (isThirdQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            thirdQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isFourthQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            fourthQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isFifthQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            fifthQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isSixthQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            sixthQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isSeventhQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            seventhQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isEighthQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            eighthQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (isNinthQuestionAnswer) {
            finalScore = finalScore + 1;
        } else {
            ninthQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
        }

        if (getTenthQuestionAnswer.equals(getString(R.string.tenthQuestionRightAnswer))) {
            finalScore = finalScore + 1;
        } else {
            tenthQuestionAnswer.setTextColor(getResources().getColor(R.color.green));
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
        int maxScore = 10;

        if (userName.length() == 0) {
            Toast.makeText(this, getString(R.string.nameToast), Toast.LENGTH_SHORT).show();
            return;
        }

        if (finalScore == maxScore) {
            TextView scoreTextView = (TextView) findViewById(R.id.summary_message);
            scoreTextView.setText(getString(R.string.wooHoo, userName) +
                    getString(R.string.you) +
                    getString(R.string.message_score, finalScore) +
                    getString(R.string.ten_of_ten));

        } else {
            TextView scoreTextView2 = (TextView) findViewById(R.id.summary_message);
            scoreTextView2.setText(getString(R.string.notCompletedMessage, userName) +
                    getString(R.string.youcansolvethis) +
                    getString(R.string.your_score, finalScore));
        }

        Toast.makeText(this, getString(R.string.finalScoreToast) + finalScore, Toast.LENGTH_SHORT).show();
    }

    public void resetQuiz(View v) {

//        Reset button color
        RadioButton questionOneAnswer = (RadioButton) findViewById(R.id.india1);
        questionOneAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionThreeAnswer = (RadioButton) findViewById(R.id.india4);
        questionThreeAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionFourAnswer = (RadioButton) findViewById(R.id.india5);
        questionFourAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionFiveAnswer = (RadioButton) findViewById(R.id.india6);
        questionFiveAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionSixAnswer = (RadioButton) findViewById(R.id.india8);
        questionSixAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionSevenAnswer = (RadioButton) findViewById(R.id.india9);
        questionSevenAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionEightAnswer = (RadioButton) findViewById(R.id.india10);
        questionEightAnswer.setTextColor(getResources().getColor(R.color.black));

        RadioButton questionNinthAnswer = (RadioButton) findViewById(R.id.india11);
        questionNinthAnswer.setTextColor(getResources().getColor(R.color.black));

//        Reset button check
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.radio_group00);
        questionOne.clearCheck();

        RadioGroup questionThree = (RadioGroup) findViewById(R.id.radio_group01);
        questionThree.clearCheck();

        RadioGroup questionFour = (RadioGroup) findViewById(R.id.radio_group02);
        questionFour.clearCheck();

        RadioGroup questionFive = (RadioGroup) findViewById(R.id.radio_group03);
        questionFive.clearCheck();

        RadioGroup questionSix = (RadioGroup) findViewById(R.id.radio_group05);
        questionSix.clearCheck();

        RadioGroup questionSeven = (RadioGroup) findViewById(R.id.radio_group06);
        questionSeven.clearCheck();

        RadioGroup questionEight = (RadioGroup) findViewById(R.id.radio_group07);
        questionEight.clearCheck();

        RadioGroup questionNine = (RadioGroup) findViewById(R.id.radio_group08);
        questionNine.clearCheck();

//          Reset the checkboxes
        CheckBox questionTwoFirstAnswer = (CheckBox) findViewById(R.id.india2);
        questionTwoFirstAnswer.setChecked(false);
        questionTwoFirstAnswer.setTextColor(getResources().getColor(R.color.black));

        CheckBox questionTwoSecondAnswer = (CheckBox) findViewById(R.id.india3);
        questionTwoSecondAnswer.setChecked(false);
        questionTwoSecondAnswer.setTextColor(getResources().getColor(R.color.black));

        CheckBox questionTwoThirdAnswer = (CheckBox) findViewById(R.id.indiaNull);
        questionTwoThirdAnswer.setTextColor(getResources().getColor(R.color.black));
        questionTwoThirdAnswer.setChecked(false);

//          Reset summary message
        TextView summaryMessage = (TextView) findViewById(R.id.summary_message);
        summaryMessage.setText(R.string.score);

//        Reset EditText value
        EditText userNameField = (EditText) findViewById(R.id.edit_text_view);
        userNameField.setText(null);

//        Reset question eleven
        EditText questionTenEditText = (EditText) findViewById(R.id.capital);
        questionTenEditText.setText(null);

    }

}
