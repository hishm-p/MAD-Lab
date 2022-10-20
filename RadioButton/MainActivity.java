package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void radioHandler(View view){
            r = (RadioButton)view;
            boolean checked= (r.isChecked());
            switch(view.getId()){
                case R.id.r1:
                    if(checked)
                        Toast.makeText(MainActivity.this, "MALE is Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.r2:
                    if(checked)
                        Toast.makeText(MainActivity.this, "FEMALE is Selected", Toast.LENGTH_SHORT).show();
                    break;
            }
    }
}