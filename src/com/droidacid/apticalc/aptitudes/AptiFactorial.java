package com.droidacid.apticalc.aptitudes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
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
	private long calcFactorial() {
		long num = 0;
		
	    if (!number.getText().toString().equals(""))
	          num = Long.parseLong(number.getText().toString());
	    try {
	        factorial = Long.parseLong(number.getText().toString());
	        for(int i=(int) (factorial-1); i>0; i--){
	            factorial = i * factorial;
	        }
	    } catch (NumberFormatException e) {
	        Log.d("factorial", "Exception");
	    } finally {}

	    return factorial;
	}
	
	
	@Override
	public void onClick(View v) {
		
		answer.setText("Factorial of " + number.getText().toString() + " is : " + calcFactorial());
		
	}

}
