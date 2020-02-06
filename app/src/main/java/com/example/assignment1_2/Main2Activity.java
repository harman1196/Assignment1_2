package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
   EditText editText;
   EditText editText2;
   Spinner sp;
   int count1 = 0;
   int count2 = 0;
   int count3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=findViewById(R.id.Name);
        editText2=findViewById(R.id.ID);
        sp=findViewById(R.id.Candidates);
    }


    public void vote(View view) {
    }
}
