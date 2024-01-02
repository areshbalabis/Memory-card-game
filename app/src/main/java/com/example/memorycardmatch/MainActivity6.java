package com.example.memorycardmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity6 extends AppCompatActivity {


    private  Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button4 = (Button) findViewById(R.id.button5);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity4();
            }
        });
    }

    public void mainActivity4(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}