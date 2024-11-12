package com.example.calculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    double number1=0, number2=0, answerVal=0;
    private Button sum, minus, multi, div;

    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        num1 = (EditText) findViewById(R.id.editTextNumber);
        num2 = (EditText) findViewById(R.id.editTextNumber2);
        sum = (Button) findViewById(R.id.addBtn);
        minus = (Button) findViewById(R.id.minusBtn);
        multi = (Button) findViewById(R.id.multBtn);
        div = (Button) findViewById(R.id.divideBtn);
        answer = (TextView) findViewById(R.id.ans);

        sum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String numStr1 = num1.getText().toString();
                String numStr2 = num2.getText().toString();

                if(TextUtils.isEmpty(numStr1) || TextUtils.isEmpty(numStr2)) {
                    answer.setText("Error");
                    return;
                }
                else {
                    number1= Double.parseDouble(numStr1);
                    number2= Double.parseDouble(numStr2);
                    answerVal= number1 + number2;
                    answer.setText(String.valueOf(answerVal));
                }
            }
        });


        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String numStr1 = num1.getText().toString();
                String numStr2 = num2.getText().toString();

                if(TextUtils.isEmpty(numStr1) || TextUtils.isEmpty(numStr2)) {
                    answer.setText("Error");
                    return;
                }
                else {
                    number1= Double.parseDouble(numStr1);
                    number2= Double.parseDouble(numStr2);
                    answerVal= number1 - number2;
                    answer.setText(String.valueOf(answerVal));
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String numStr1 = num1.getText().toString();
                String numStr2 = num2.getText().toString();

                if(TextUtils.isEmpty(numStr1) || TextUtils.isEmpty(numStr2)) {
                    answer.setText("Error");
                    return;
                }
                else {
                    number1= Double.parseDouble(numStr1);
                    number2= Double.parseDouble(numStr2);
                    answerVal= number1 * number2;
                    answer.setText(String.valueOf(answerVal));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String numStr1 = num1.getText().toString();
                String numStr2 = num2.getText().toString();

                if(TextUtils.isEmpty(numStr1) || TextUtils.isEmpty(numStr2)) {
                    answer.setText("Error");
                    return;
                }
                else {
                    number1= Double.parseDouble(numStr1);
                    number2= Double.parseDouble(numStr2);
                    answerVal= number1 / number2;
                    answer.setText(String.valueOf(answerVal));
                }
            }
        });
    }
}