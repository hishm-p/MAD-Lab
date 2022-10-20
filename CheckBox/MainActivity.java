package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkSelect(View view){
        c = (CheckBox)view;
        boolean checked= (c.isChecked());
        switch(view.getId()){
            case R.id.c1:
                if(checked)
                    Toast.makeText(MainActivity.this, "English is Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "English is Deselected", Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());

            case R.id.c2:
                if(checked)
                    Toast.makeText(MainActivity.this, "Malayalam is Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Malayalam is Deselected", Toast.LENGTH_SHORT).show();
                break;
        }

    }


}