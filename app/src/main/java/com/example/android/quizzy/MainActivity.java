package com.example.android.quizzy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Activity mActivity;

    //code for restarting the activity after user answered the questions
    public static void restartActivity(Activity activity) {
        activity.recreate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mActivity = MainActivity.this;

        Button button = (Button) findViewById(R.id.restart_button);
        button.setOnClickListener(new View.OnClickListener() {
            //            resetting the checkboxes to initial value false when restarting
            @Override
            public void onClick(View v) {
                restartActivity(mActivity);
                final CheckBox q1CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ1);
                final CheckBox q1CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ1);
                q1CheckBox1.setChecked(false);
                q1CheckBox2.setChecked(false);
                final CheckBox q2CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ2);
                final CheckBox q2CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ2);
                q2CheckBox1.setChecked(false);
                q2CheckBox2.setChecked(false);
                final CheckBox q3CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ3);
                final CheckBox q3CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ3);
                q3CheckBox1.setChecked(false);
                q3CheckBox2.setChecked(false);
                final CheckBox q4CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ4);
                final CheckBox q4CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ4);
                q4CheckBox1.setChecked(false);
                q4CheckBox2.setChecked(false);
                final CheckBox q5CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ5);
                final CheckBox q5CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ5);
                final CheckBox q5CheckBox3 = (CheckBox) findViewById(R.id.thirdAnswerQ5);
                q5CheckBox1.setChecked(false);
                q5CheckBox2.setChecked(false);
                q5CheckBox3.setChecked(false);
                final CheckBox q6CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ6);
                final CheckBox q6CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ6);
                q6CheckBox1.setChecked(false);
                q6CheckBox2.setChecked(false);
                final CheckBox q7CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ7);
                final CheckBox q7CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ7);
                q7CheckBox1.setChecked(false);
                q7CheckBox2.setChecked(false);
                final CheckBox q8CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ8);
                final CheckBox q8CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ8);
                q8CheckBox1.setChecked(false);
                q8CheckBox2.setChecked(false);
                final CheckBox q9CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ9);
                final CheckBox q9CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ9);
                q9CheckBox1.setChecked(false);
                q9CheckBox2.setChecked(false);
                final CheckBox q10CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ10);
                final CheckBox q10CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ10);
                final CheckBox q10CheckBox3 = (CheckBox) findViewById(R.id.thirdAnswerQ10);
                q10CheckBox1.setChecked(false);
                q10CheckBox2.setChecked(false);
                q10CheckBox3.setChecked(false);

            }

        });
    }

    //    code for getting the status of each checkbox on submit answer
//    code for validating the correct answer on each question
    public String submitAnswers(View view) {

        CheckBox q1CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ1);
        CheckBox q1CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ1);
        boolean q1CorrectAnswer = q1CheckBox2.isChecked() && !q1CheckBox1.isChecked();


        final CheckBox q2CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ2);
        final CheckBox q2CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ2);
        boolean q2CorrectAnswer = q2CheckBox1.isChecked() && !q2CheckBox2.isChecked();


        final CheckBox q3CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ3);
        final CheckBox q3CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ3);
        boolean q3CorrectAnswer = q3CheckBox1.isChecked() && !q3CheckBox2.isChecked();


        final CheckBox q4CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ4);
        final CheckBox q4CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ4);
        boolean q4CorrectAnswer = q4CheckBox1.isChecked() && !q4CheckBox2.isChecked();


        final CheckBox q5CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ5);
        final CheckBox q5CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ5);
        final CheckBox q5CheckBox3 = (CheckBox) findViewById(R.id.thirdAnswerQ5);
        boolean q5CorrectAnswer = q5CheckBox1.isChecked() && q5CheckBox2.isChecked() && q5CheckBox3.isChecked();


        final CheckBox q6CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ6);
        final CheckBox q6CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ6);
        boolean q6CorrectAnswer = q6CheckBox1.isChecked() && !q6CheckBox2.isChecked();


        final CheckBox q7CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ7);
        final CheckBox q7CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ7);
        boolean q7CorrectAnswer = q7CheckBox2.isChecked() && !q7CheckBox1.isChecked();


        final CheckBox q8CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ8);
        final CheckBox q8CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ8);
        boolean q8CorrectAnswer = q8CheckBox2.isChecked() && !q8CheckBox1.isChecked();


        final CheckBox q9CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ9);
        final CheckBox q9CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ9);
        boolean q9CorrectAnswer = q9CheckBox2.isChecked() && !q9CheckBox1.isChecked();


        final CheckBox q10CheckBox1 = (CheckBox) findViewById(R.id.firstAnswerQ10);
        final CheckBox q10CheckBox2 = (CheckBox) findViewById(R.id.secondAnswerQ10);
        final CheckBox q10CheckBox3 = (CheckBox) findViewById(R.id.thirdAnswerQ10);
        boolean q10CorrectAnswer = q10CheckBox1.isChecked() && !q10CheckBox2.isChecked() && !q10CheckBox3.isChecked();


        EditText txtname = (EditText) findViewById(R.id.user_name);
        String userName = txtname.getText().toString();

        int results = calculateResults(q1CorrectAnswer, q2CorrectAnswer, q3CorrectAnswer, q4CorrectAnswer, q5CorrectAnswer, q6CorrectAnswer, q7CorrectAnswer, q8CorrectAnswer, q9CorrectAnswer, q10CorrectAnswer);
        String quizMessage = createSummary(results, userName);
        return quizMessage;

    }

    //code for displaying the summary touser depending on the number of correct answers
    private String createSummary(int results, String yourName) {
        if (results > 7) {
            Context context = getApplicationContext();
            String quizMessage = "Great job " + yourName + ". You answered correctly to " + results + " questions! Seems that you did pay attention to those Geography classes!";
            CharSequence text = quizMessage;
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return quizMessage;
        }
        if (results < 3) {
            Context context = getApplicationContext();
            String quizMessage = "My dear " + yourName + ", you answered correctly to " + results + " questions. Do you know what GEOGRAPHY is?";
            CharSequence text = quizMessage;
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return quizMessage;
        }
        Context context = getApplicationContext();
        String quizMessage = "You've been a naughty boy " + yourName + ". You answered correctly to " + results + " questions! Seems that you did not pay attention to those Geography classes! Would you like to try again?";
        CharSequence text = quizMessage;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        return quizMessage;
    }

    //calculates the total number of correct answers
    private int calculateResults(boolean q1CorrectAnswer, boolean q2CorrectAnswer, boolean q3CorrectAnswer, boolean q4CorrectAnswer, boolean q5CorrectAnswer, boolean q6CorrectAnswer, boolean q7CorrectAnswer, boolean q8CorrectAnswer, boolean q9CorrectAnswer, boolean q10CorrectAnswer) {
        int correctAnswers = 0;
        if (q1CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q2CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q3CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q4CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q5CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q6CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q7CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q8CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q9CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        if (q10CorrectAnswer) {
            correctAnswers = correctAnswers + 1;
        }
        return correctAnswers;
    }

}
