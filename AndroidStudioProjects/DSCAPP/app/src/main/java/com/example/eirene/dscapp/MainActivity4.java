package com.example.eirene.dscapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = findViewById(R.id.btn);


    }

    public void register(View view){

        Intent intent = new Intent(MainActivity4.this, main5.class);
        startActivity(intent);

    }
}
