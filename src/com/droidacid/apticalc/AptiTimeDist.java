package com.droidacid.apticalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class AptiTimeDist extends Activity implements OnClickListener, OnCheckedChangeListener{

	Button BCalc;
	EditText EtTime, EtDistance, EtSpeed;
	TextView TvResult;
	RadioGroup RgTimeDist;
	String tag = "Time Speed Distance";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aptitimedist);
		initialize();
	}

	private void initialize() {
		
		BCalc = (Button) findViewById(R.id.BCalcTDS);
		EtTime = (EditText) findViewById(R.id.EtTime);
		EtSpeed = (EditText) findViewById(R.id.EtSpeed);
		EtDistance = (EditText) findViewById(R.id.Etdistance);
		TvResult = (TextView) findViewById(R.id.TvResult);
		RgTimeDist = (RadioGroup) findViewById(R.id.RgTimeDist);
		RgTimeDist.setOnCheckedChangeListener(this);
		BCalc.setOnClickListener(this);
		Log.d(tag, "Inside Inilialize method of aptiTimeDist class");
		
	}

	@Override
	public void onClick(View v) {
		
		 if (v.getId() == R.id.BCalcTDS){
			int selectedRB = RgTimeDist.getCheckedRadioButtonId();
			
			if(EtTime.getText().toString().equals("")) EtTime.setText("0");
			if(EtSpeed.getText().toString().equals("")) EtSpeed.setText("0");
			if(EtDistance.getText().toString().equals("")) EtDistance.setText("0");
			
			Double Time = Double.parseDouble(EtTime.getText().toString());
			Double Speed = Double.parseDouble(EtSpeed.getText().toString());
			Double Dist = Double.parseDouble(EtDistance.getText().toString());
			Log.d(tag, "Button If condition");
						
			switch(selectedRB){
			case R.id.RbTime:
				TvResult.setText("Time taken = " + Double.toString(Dist / Speed) +" hrs");
				Log.d(tag, "Inside time condition");
			break;
			
			case R.id.RbSpeed:				
				TvResult.setText("Speed = " + Double.toString(Dist / Time) + " km/hr");
				Log.d(tag, "Inside speed condition");
			break;
			
			case R.id.RbDistance:
				TvResult.setText("Distance = " + Double.toString(Speed * Time) + " km");
				Log.d(tag, "Inside distance condition");
			break;
			}
		}
		
	}
	
	@Override
	public void onCheckedChanged(RadioGroup RgTimeDist, int TimeDist) {
		
		switch(TimeDist){
		
		case R.id.RbTime:
			EtTime.setVisibility(View.GONE);
			EtSpeed.setVisibility(View.VISIBLE);
			EtDistance.setVisibility(View.VISIBLE);
			Log.d(tag, "Inside time switch case");
			break;			
		case R.id.RbSpeed:
			EtSpeed.setVisibility(View.GONE);
			EtTime.setVisibility(View.VISIBLE);
			EtDistance.setVisibility(View.VISIBLE);
			Log.d(tag, "Inside speed switch case");
			break;
		case R.id.RbDistance:
			EtDistance.setVisibility(View.GONE);
			EtSpeed.setVisibility(View.VISIBLE);
			EtTime.setVisibility(View.VISIBLE);
			Log.d(tag, "Inside distance switch case");
			break;
		}
		
	}

}
