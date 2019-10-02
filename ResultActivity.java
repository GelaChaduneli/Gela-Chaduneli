package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class ResultActivity extends Activity {

    public EditText result;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result=findViewById(R.id.result);

        Intent intent=getIntent();
        result.setText(QuizActivity.counter);

    }


}
