package com.geektech.month3_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textOne;
    TextView textTwo;
    TextView textThree;
    String name;
    String Surname;
    Integer age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        setName();

    }

    private void findViews(){
        textOne = findViewById(R.id.tv_one);
        textTwo = findViewById(R.id.tv_two);
        textThree = findViewById(R.id.tv_three);
    }

    private void setName (){
        name = getIntent().getStringExtra("name");
        Surname = getIntent().getStringExtra("Surname");
        age = getIntent().getIntExtra("age", 1000);
        textOne.setText(name);
        textTwo.setText(Surname);
        textThree.setText(age.toString());
    }

}