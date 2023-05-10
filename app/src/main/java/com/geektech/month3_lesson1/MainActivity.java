package com.geektech.month3_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editFirst;
    EditText editSecond;
    EditText editThird;
    Button button;
    String name;
    String surName;
    Integer age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClick();

    }

    private void findViews(){
        editFirst = findViewById(R.id.edit_first);
        editSecond = findViewById(R.id.edit_second);
        editThird = findViewById(R.id.edit_third);
        button = findViewById(R.id.btn);
    }

    private void setClick(){
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            initEdit();
            navigateToSecond();
        }
    });
    }
    private void initEdit() {
        name = editFirst.getText().toString();
        surName = editSecond.getText().toString();
        age = Integer.valueOf(editThird.getText().toString());

    }

    private void navigateToSecond(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("surname",surName);
        intent.putExtra("age",age);
        startActivity(intent);
    }
}