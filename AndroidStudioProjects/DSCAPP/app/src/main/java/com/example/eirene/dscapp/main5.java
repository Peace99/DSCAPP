package com.example.eirene.dscapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main5 extends AppCompatActivity {
    Button btn;
    EditText name,faculty,level,matric,track;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn = findViewById(R.id.button);
        name = findViewById(R.id.name);
        faculty = findViewById(R.id.faculty);
        level =  findViewById(R.id.level);
        matric = findViewById(R.id.matric);
        track = findViewById(R.id.track);
    }

    public void submit(View view){

        name.getText().clear();
        faculty.getText().clear();
        level.getText().clear();
        matric.getText().clear();
        track.getText().clear();


        Intent intent = new Intent(main5.this, MainActivity4.class);
        startActivity(intent);

    }
}

