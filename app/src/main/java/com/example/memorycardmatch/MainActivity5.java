package com.example.memorycardmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity5 extends AppCompatActivity {

    private  Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button3 = (Button) findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity2();
            }
        });
    }

    public void mainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}