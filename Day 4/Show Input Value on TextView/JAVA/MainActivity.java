package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btn1;
EditText et1;
TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        et1 = findViewById(R.id.et1);
        tv1 = findViewById(R.id.tv1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = et1.getText().toString();
                tv1.setText("Your Text is " + txt);
                //Toast.makeText(MainActivity.this, txt , Toast.LENGTH_SHORT).show();
            }
        });
    }
}