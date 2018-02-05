package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class Activity extends AppCompatActivity {

    TextView result_view;
    int s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            s = extras.getInt("score");
        }
        result_view = findViewById(R.id.result_text);
        result_view.setText(getString(R.string.yoy_have) + " " + s + " " + getString(R.string.correct_answers));
    }


    // show result of quiz
    public void send (View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.i_have) + s + getString(R.string.correct_answer));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Etymology quiz");
        if (intent.resolveActivity(getPackageManager()) != null)   {
            startActivity(intent);
        }
    }



}

