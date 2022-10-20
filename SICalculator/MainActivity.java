package com.example.sicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int value,si,p,r,t;

    Button button;

    EditText principal,rate,time;

    TextView result,interest;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principal = findViewById(R.id.principal);
        rate = findViewById(R.id.rate);
        time = findViewById(R.id.time);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);
        interest = findViewById(R.id.interest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p= Integer.parseInt(principal.getText().toString());
                r= Integer.parseInt(rate.getText().toString());
                t= Integer.parseInt(time.getText().toString());

                si = (p*r*t)/100;
                value = p + si;

                result.setText(String.valueOf(value));

                interest.setText(String.valueOf(si));

            }
        });

    }
}