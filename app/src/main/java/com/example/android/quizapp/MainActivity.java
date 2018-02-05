package com.example.android.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    Toast t;
    RadioGroup rg1, rg2, rg3, rg4, rg5;



    static final String STATE_SCORE = "score";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initialize RadioGroups for questions and TextView for result of test
        rg1 = findViewById(R.id.radio_group1);
        rg2 = findViewById(R.id.radio_group2);
        rg3 = findViewById(R.id.radio_group3);
        rg4 = findViewById(R.id.radio_group4);
        rg5 = findViewById(R.id.radio_group5);



        Button submit = (Button) findViewById(R.id.submit_button);

        // Set a click listener on that View
        submit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent submitIntent = new Intent(getApplicationContext(), Activity.class);
                submitIntent.putExtra("score", score);

                // Start the new activity
                startActivity(submitIntent);
            }
        });
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the player's current score state
        savedInstanceState.putInt(STATE_SCORE, score);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore score from saved instance
        score = savedInstanceState.getInt(STATE_SCORE);
    }

    // First question
    public void check1(View view) {
        if (rg1.getCheckedRadioButtonId() == R.id.timer_r_b) {
            score++;
            t = Toast.makeText(this, R.string.right_answer_1, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        } else {
            t = Toast.makeText(this, R.string.wrong_answer1, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }
        for (int i = 0; i < rg1.getChildCount(); i++) {
            rg1.getChildAt(i).setEnabled(false);
        }
    }

    // Second question
    public void check2(View view) {
        if (rg2.getCheckedRadioButtonId() == R.id.futro_r_b) {
            score++;
            t = Toast.makeText(this, R.string.right_answer2, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();

        } else {
            t = Toast.makeText(this, R.string.wrong_answer2, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }
        for (int i = 0; i < rg2.getChildCount(); i++) {
            rg2.getChildAt(i).setEnabled(false);
        }
    }


    // Third question
    public void check3(View view) {

        if (rg3.getCheckedRadioButtonId() == R.id.fallen_r_b) {
            score++;
            t = Toast.makeText(this, R.string.right_answer3, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();

        } else {
            t = Toast.makeText(this, R.string.wrong_answer3, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }
        for (int i = 0; i < rg3.getChildCount(); i++) {
            rg3.getChildAt(i).setEnabled(false);
        }
    }

    // Forth question
    public void check4(View view) {
        if (rg4.getCheckedRadioButtonId() == R.id.touren_r_b) {
            score++;
            t = Toast.makeText(this, R.string.right_answer4, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();

        } else {
            t = Toast.makeText(this, R.string.wrong_answer4, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }
        for (int i = 0; i < rg4.getChildCount(); i++) {
            rg4.getChildAt(i).setEnabled(false);
        }
    }

    // Fifth question
    public void check5(View view) {
        if (rg5.getCheckedRadioButtonId() == R.id.zamek_r_B) {
            score++;
            t = Toast.makeText(this, R.string.right_answer5, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();

        } else {
            t = Toast.makeText(this, R.string.wrong_answer5, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }
        for (int i = 0; i < rg5.getChildCount(); i++) {
            rg5.getChildAt(i).setEnabled(false);
        }

    }

    // reset quiz
    public void click_restart(View view) {
        score = 0;

        setContentView(R.layout.activity_main);

        rg1 = findViewById(R.id.radio_group1);
        rg2 = findViewById(R.id.radio_group2);
        rg3 = findViewById(R.id.radio_group3);
        rg4 = findViewById(R.id.radio_group4);
        rg5 = findViewById(R.id.radio_group5);
    }
}





