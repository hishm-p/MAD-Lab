package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eu,ep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eu = findViewById(R.id.user);
        ep = findViewById(R.id.pass);

        Button b = findViewById(R.id.login);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eu.getText().toString().equals("admin") && ep.getText().toString().equals("password")) {
                    Toast.makeText(MainActivity.this,"Valid User", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid User",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}