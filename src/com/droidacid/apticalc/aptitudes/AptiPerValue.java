package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AptiPerValue extends Activity implements android.view.View.OnClickListener{

    EditText EtValueNumber, EtPercent;
    Button calculate;
    TextView TVPercentValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aptipervalue);

        initialize();
    }

    protected void initialize(){


        EtValueNumber = (EditText) findViewById(R.id.EtPercentValue);
        EtPercent = (EditText) findViewById(R.id.EtPercent);
        TVPercentValue = (TextView) findViewById(R.id.TvPercentValue);
        calculate = (Button) findViewById(R.id.bcalcPercentValue);
        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

         if(EtValueNumber.getText().toString().equals("")) EtValueNumber.setText("0");
         if(EtPercent.getText().toString().equals("")) EtPercent.setText("0");
         Double value = Double.parseDouble(EtValueNumber.getText().toString());
         Double percent = Double.parseDouble(EtPercent.getText().toString());
         String valueresult = percent + "% of "+ value +" is " + (Double.toString((percent * value) / 100));
         TVPercentValue.setText(valueresult);

        }

    }


