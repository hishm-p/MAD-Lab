package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int cvalue=0;

    Button plusb,minusb,resetb;
    EditText counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minusb = findViewById(R.id.minusb);
        plusb = findViewById(R.id.plusb);
        counter = findViewById(R.id.counter);
        resetb = findViewById(R.id.resetb);

        minusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( cvalue > 0){
                    cvalue = cvalue - 1;
                    counter.setText(cvalue + "");
                }

            }
        });

        plusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvalue = cvalue + 1;
                counter.setText(cvalue + "");
            }
        });

        resetb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvalue = 0;
                counter.setText(cvalue + "");
            }
        });
    }
}