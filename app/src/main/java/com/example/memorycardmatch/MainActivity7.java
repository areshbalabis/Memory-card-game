package com.example.memorycardmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity7 extends AppCompatActivity {

    private  Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button5 = (Button) findViewById(R.id.button6);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity5();
            }
        });
    }
    public void mainActivity5(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

}