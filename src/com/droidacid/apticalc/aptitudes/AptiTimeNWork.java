package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class AptiTimeNWork extends Activity implements OnClickListener, OnCheckedChangeListener{
	
	TextView TVoutput;
	RadioGroup RGselect;
	EditText num1, num2, num3;
	Button calculate;
	RadioButton RBtwo, RBthree;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aptitimenwork);
		initialize();
	}	
	
		private void initialize() 
		{
		
		TVoutput = (TextView) findViewById(R.id.TV_apti_result);
		RGselect = (RadioGroup) findViewById(R.id.rg_apti_Select);
		
		num1 = (EditText) findViewById(R.id.ET_apti_firstperson);
		num2 = (EditText) findViewById(R.id.ET_apti_secondperson);
		num3 = (EditText) findViewById(R.id.ET_apti_thirdperson);
		calculate = (Button) findViewById(R.id.b_apti_calcWD);
		calculate.setOnClickListener(this);
		RGselect.setOnCheckedChangeListener(this);
		
		
		}
		
		@Override
		public void onClick(View v) {
			if (v.getId() == R.id.bcalcWD){
				int selectedRB = RGselect.getCheckedRadioButtonId();
				
				if (num1.getText().toString().equals("")) num1.setText("0");
				if (num2.getText().toString().equals("")) num2.setText("0");
				if (num3.getText().toString().equals("")) num3.setText("0");
				
				Double numb1 = Double.parseDouble(num1.getText().toString());
				Double numb2 = Double.parseDouble(num2.getText().toString());
				Double numb3 = Double.parseDouble(num3.getText().toString());
				
				
				switch (selectedRB){
				case R.id.rbtwoperson:
					TVoutput.setText("Time taken = " + Double.toString(100 / (100/numb1 + 100/numb2)) + " days");
					
					break;
				case R.id.rbthreeperson:
					TVoutput.setText("Time taken = " + Double.toString(100 / (100/numb1 + 100/numb2 + 100/numb3)) + " days");
					break;
				}
			}		
		}
		
	
		@Override
		public void onCheckedChanged(RadioGroup arg0, int arg1) {
			
			switch (arg1){
			case R.id.rb_apti_twoperson:
				num3.setVisibility(View.GONE);
				
				break;
			case R.id.rb_apti_threeperson:
				num3.setVisibility(View.VISIBLE);
				
				break;
			
			}
			
		}	

		
	}
