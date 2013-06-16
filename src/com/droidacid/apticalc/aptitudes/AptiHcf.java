package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ShivamD on 5/18/13.
 */
public class AptiHcf extends Activity implements View.OnClickListener {

	Button calculate;
	EditText EtNumber1, EtNumber2; // EtNumber3;
	TextView TvLcmResult;
	double max, min, lcm = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aptilcmhcf);
		initialize();
		
	}

	protected void initialize() {
		calculate = (Button) findViewById(R.id.b_apti_Hcf);
		EtNumber1 = (EditText) findViewById(R.id.Et_apti_Hcf1);
		EtNumber2 = (EditText) findViewById(R.id.Et_apti_Hcf2);
		// EtNumber3 = (EditText) findViewById(R.id.Et_apti_Hcf3);
		TvLcmResult = (TextView) findViewById(R.id.Tv_apti_LcmResult);
		calculate.setOnClickListener(this);
		values();
	}

	private void values() {
		if (EtNumber1.getText().toString().equals(""))
			EtNumber1.setText("0");
		if (EtNumber2.getText().toString().equals(""))
			EtNumber2.setText("0");
		// if (num3.getText().toString().equals("")) num3.setText("0");

		Double numb1 = Double.parseDouble(EtNumber1.getText().toString());
		Double numb2 = Double.parseDouble(EtNumber2.getText().toString());
		// Double numb3 = Double.parseDouble(num3.getText().toString());
		calcHCF(numb1, numb2);
		calcLCM(numb1, numb2);
	}

	private void calcLCM(double num1, double num2) {
		if(num1 > num2){
			max = num1;
			min = num2;
		}
		else{
			max = num2;
			min = num1;
		}
		for(int i = 1; i <= min ; i++){
			double x = max * i;
			if(x % min == 0){
				lcm = x;
				break;
			}
		}
	TvLcmResult.setText("L.C.M is : " + lcm);
	}

	private void calcHCF(double num1, double num2) {

	}

	@Override
	public void onClick(View v) {

		switch

	}
}
