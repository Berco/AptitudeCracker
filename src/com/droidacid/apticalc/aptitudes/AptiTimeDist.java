package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.os.Bundle;
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
		
		BCalc = (Button) findViewById(R.id.B_apti_CalcTDS);
		EtTime = (EditText) findViewById(R.id.Et_apti_Time);
		EtSpeed = (EditText) findViewById(R.id.Et_apti_Speed);
		EtDistance = (EditText) findViewById(R.id.Et_apti_distance);
		TvResult = (TextView) findViewById(R.id.Tv_apti_Result);
		RgTimeDist = (RadioGroup) findViewById(R.id.Rg_apti_TimeDist);
		RgTimeDist.setOnCheckedChangeListener(this);
		BCalc.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		
		 if (v.getId() == R.id.B_apti_CalcTDS){
			int selectedRB = RgTimeDist.getCheckedRadioButtonId();
			
			if(EtTime.getText().toString().equals("")) EtTime.setText("0");
			if(EtSpeed.getText().toString().equals("")) EtSpeed.setText("0");
			if(EtDistance.getText().toString().equals("")) EtDistance.setText("0");
			
			Double Time = Double.parseDouble(EtTime.getText().toString());
			Double Speed = Double.parseDouble(EtSpeed.getText().toString());
			Double Dist = Double.parseDouble(EtDistance.getText().toString());
			
						
			switch(selectedRB){
			case R.id.Rb_apti_Time:
				TvResult.setText("Time taken = " + Double.toString(Dist / Speed) +" hrs");
				
			break;
			
			case R.id.Rb_apti_Speed:				
				TvResult.setText("Speed = " + Double.toString(Dist / Time) + " km/hr");
				
			break;
			
			case R.id.Rb_apti_Distance:
				TvResult.setText("Distance = " + Double.toString(Speed * Time) + " km");
				
			break;
			}
		}
		
	}
	
	@Override
	public void onCheckedChanged(RadioGroup RgTimeDist, int TimeDist) {
		
		switch(TimeDist){
		
		case R.id.Rb_apti_Time:
			EtTime.setVisibility(View.GONE);
			EtSpeed.setVisibility(View.VISIBLE);
			EtDistance.setVisibility(View.VISIBLE);
			
			break;			
		case R.id.Rb_apti_Speed:
			EtSpeed.setVisibility(View.GONE);
			EtTime.setVisibility(View.VISIBLE);
			EtDistance.setVisibility(View.VISIBLE);
			
			break;
		case R.id.Rb_apti_Distance:
			EtDistance.setVisibility(View.GONE);
			EtSpeed.setVisibility(View.VISIBLE);
			EtTime.setVisibility(View.VISIBLE);
			
			break;
		}
		
	}

}
