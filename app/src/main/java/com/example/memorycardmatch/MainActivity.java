package com.example.memorycardmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private  Button button;
    private  Button button1;
    private  Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity2();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity3();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity4();
            }
        });
    }

    public void mainActivity2(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void mainActivity3(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void mainActivity4(){
        Intent intent = new Intent(this , MainActivity7.class);
        startActivity(intent);
    }
}