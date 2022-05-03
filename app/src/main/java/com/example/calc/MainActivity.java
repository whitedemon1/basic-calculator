package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    TextView textView;
    Button plus,minus,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.edT1);
        editText2=findViewById(R.id.edT2);
        textView=findViewById(R.id.textView);
        plus=findViewById(R.id.button1);
        minus=findViewById(R.id.button2);
        multiply=findViewById(R.id.button3);
        divide=findViewById(R.id.button4);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(editText1.getText().toString());
                b=Double.parseDouble(editText2.getText().toString());
                c=a+b;
                textView.setText(Double.toString(c));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(editText1.getText().toString());
                b=Double.parseDouble(editText2.getText().toString());
                c=a-b;
                textView.setText(Double.toString(c));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(editText1.getText().toString());
                b=Double.parseDouble(editText2.getText().toString());
                c=a*b;
                textView.setText(Double.toString(c));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(editText1.getText().toString());
                b=Double.parseDouble(editText2.getText().toString());
                c=a/b;
                textView.setText(Double.toString(c));
            }
        });
    }
}