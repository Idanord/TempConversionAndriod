package com.example.will.tempconvertionandriod2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    //Define Variables
    EditText temp;
    RadioButton toC;
    RadioButton toF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //casting
        temp = (EditText) findViewById(R.id.temperatureEditText);
        toC = (RadioButton) findViewById(R.id.celsiusRadioButton);
        toF = (RadioButton) findViewById(R.id.farenheitRadioButton);
    }

    public void convert(View v){

        //temp variables
        double value = new Double(temp.getText().toString());

        if(toC.isChecked()){
            value = UnitConverter.farenheite2Celsius(value);
        } else {
            value = UnitConverter.celsius2Farenheit(value);
        }

        temp.setText(new Double(value).toString());

    }
}
