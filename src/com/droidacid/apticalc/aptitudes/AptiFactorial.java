package com.droidacid.apticalc.aptitudes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.droidacid.apticalc.R;

public class AptiFactorial extends Activity implements android.view.View.OnClickListener{
	EditText number;
	TextView answer;
	Button calculate;
	
	long factorial = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.apti_factorial);
		initialize();
		calcFactorial();
	}
	private void initialize() {
		number = (EditText) findViewById(R.id.et_apti_number);
		answer = (TextView) findViewById(R.id.tv_apti_answer);
		calculate = (Button) findViewById(R.id.b_apti_calc);
		calculate.setOnClickListener(this);
	}
	private void calcFactorial() {
		if (number.getText().toString().equals("")) number.setText("0");
		int num = Integer.parseInt(number.getText().toString());
		for(int i = 1; i<=num; i++){
			factorial = i * factorial;
		}
		
	}
	
	
	@Override
	public void onClick(View v) {
		calcFactorial();
		answer.setText("Factorial of " + number.getText().toString() + " is : " + factorial);
		
	}

}
