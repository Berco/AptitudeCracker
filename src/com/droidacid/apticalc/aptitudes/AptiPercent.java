package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AptiPercent extends Activity implements android.view.View.OnClickListener{
	
	EditText numerator, denominator;
	Button bpercent, percentvalue;
	TextView output;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aptipercent);
		
		numerator = (EditText) findViewById(R.id.Et_apti_numerator);
		denominator = (EditText) findViewById(R.id.Et_apti_denominator);
		bpercent = (Button) findViewById(R.id.b_apti_calcPercent);
		output = (TextView) findViewById(R.id.Tv_apti_output);
        percentvalue = (Button) findViewById(R.id.b_apti_calcValue);

		bpercent.setOnClickListener(this);
        percentvalue.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

        switch(v.getId()){
            case R.id.calcPercent:
                // Parse the input values to num and den as double

                if(numerator.getText().toString().equals("")) numerator.setText("0");
                if(denominator.getText().toString().equals("")) denominator.setText("0");
                Double num = Double.parseDouble(numerator.getText().toString());
                Double den = Double.parseDouble(denominator.getText().toString());
                String result = num + " is " + (Double.toString((num / den) * 100)) + " % of " + den;
                output.setText(result);
            break;
            case R.id.b_apti_calcValue:
            	Intent PercentValue = new Intent(this, AptiPerValue.class);
                startActivity(PercentValue);
            break;
        }

	}
	
}
