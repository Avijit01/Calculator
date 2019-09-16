package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText Input1,Input2;
    private Button add,sub,multiply,divide,reset;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input1 = (EditText) findViewById(R.id.Input1Id);
        Input2 = (EditText) findViewById(R.id.Input2Id);
        Result = (TextView) findViewById(R.id.ResultId);

        add = (Button)findViewById(R.id.AddId);
        sub = (Button)findViewById(R.id.SubtractId);
        multiply = (Button)findViewById(R.id.multiplyId);
        divide = (Button)findViewById(R.id.DivideId);
        reset = (Button)findViewById(R.id.ResetId);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try {
            String number1 = Input1.getText().toString();
            String number2 = Input2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);


            if(v.getId()==R.id.AddId)
            {
                double result2 = num1 + num2;
                Result.setText("Result: "+result2);
            }

            if(v.getId()==R.id.SubtractId)
            {
                double result2 = num1-num2;
                Result.setText("Result: "+result2);
            }

            if(v.getId()==R.id.multiplyId)
            {
                double result2 = num1*num2;
                Result.setText("Result: "+result2);
            }

            if(v.getId()==R.id.DivideId)
            {
                double result2 = num1/num2;
                Result.setText("Result: "+result2);
            }

            if(v.getId()==R.id.ResetId)
            {
                Result.setText("");
                Input1.setText("");
                Input2.setText("");
            }

        }catch (Exception e){
            Toast.makeText(MainActivity.this,"Please Insert Inputs",Toast.LENGTH_SHORT).show();
        }

    }
}
