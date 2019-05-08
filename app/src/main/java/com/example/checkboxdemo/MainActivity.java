package com.example.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CheckBox android,java,php,python,unity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android = findViewById(R.id.androidCheckBox);
        android.setOnClickListener(this);
        java = findViewById(R.id.javaCheckBox);
      java.setOnClickListener((View.OnClickListener) this);
        php = findViewById(R.id.phpCheckBox);
       php.setOnClickListener(this);
        python = findViewById(R.id.pythonCheckBox);
        python.setOnClickListener(this);
        unity = findViewById(R.id.unityCheckBox);
        unity.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
         switch (v.getId()) {
             case R.id.androidCheckBox:
                 if(android.isChecked())
                     Toast.makeText(this, "android", Toast.LENGTH_SHORT).show();
         break;

             case R.id.javaCheckBox:
                 if(java.isChecked())
                     Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
                 break;

             case R.id.phpCheckBox:
                 if(php.isChecked())
                     Toast.makeText(this, "php", Toast.LENGTH_SHORT).show();
                 break;

             case R.id.pythonCheckBox:
                 if(python.isChecked())
                     Toast.makeText(this, "python", Toast.LENGTH_SHORT).show();
                 break;

             case R.id.unityCheckBox:
                 if(unity.isChecked())
                     Toast.makeText(this, "unity", Toast.LENGTH_SHORT).show();
                 break;
         }
    }
    }
