package com.example.mridul.calculatordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaring fields for Addition purpose
    EditText etFirstNumberAdd, etSecondNumberAdd;
    TextView tvResultAdd;
    Button btnCalculateAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing variables that we have taken for Addition purpose
        etFirstNumberAdd = findViewById(R.id.etFirstNumberAdd);
        etSecondNumberAdd = findViewById(R.id.etSecondNumberAdd);
        tvResultAdd = findViewById(R.id.tvResultAdd);
        btnCalculateAdd = findViewById(R.id.btnCalculateAdd);

        // setting click listener to btnCalculateAdd
        // - when we click the button, the codes inside the Override-method onClick will execute
        btnCalculateAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the input values form EditText fields & store in String variables
                String strFirstNumber = etFirstNumberAdd.getText().toString();
                String strSecondNumber = etSecondNumberAdd.getText().toString();

                // check is both field is empty or not.
                // if both fields empty- then show a message that "Please input both fields"
                if (strFirstNumber.isEmpty() || strSecondNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please input both fields.", Toast.LENGTH_SHORT).show();

                } else {// if both fields has value then calculate the addition of two number

                    // parse Values from String to double for calculation purpose
                    double firstNumber = Double.parseDouble(strFirstNumber);
                    double secondNumber = Double.parseDouble(strSecondNumber);

                    // Calculations
                    double addition = firstNumber + secondNumber;

                    // to set the result in TextView, convert the double (addition) to String (result)
                    String result = String.valueOf(addition);

                    // Set the result in the TextView
                    tvResultAdd.setText(result);
                }
            }
        });


    }
}
