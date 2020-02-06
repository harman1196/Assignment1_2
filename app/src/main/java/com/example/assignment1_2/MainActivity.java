package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView textView;
     TextView textView2;
     TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.candidate1);
        textView2=findViewById(R.id.candidate2);
        textView3=findViewById(R.id.candidate3);
    }

    public void NextPage(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
      startActivity(intent);
    }
}
