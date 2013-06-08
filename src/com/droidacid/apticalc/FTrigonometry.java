package com.droidacid.apticalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FTrigonometry extends Activity implements OnClickListener{

	Button bTrigBasics, bTrigCommonAngles, bTrigPeriodicFormulas, bTrigPythagorean, 
	bHalfAngleFormulas;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ftrigonometry);
		initialize();
	}

	private void initialize() {
		
		bTrigBasics = (Button) findViewById(R.id.bTrigBasics);
		bTrigCommonAngles = (Button) findViewById(R.id.bTrigCommonAngles);
		bTrigPeriodicFormulas = (Button) findViewById(R.id.bTrigPeriodicFormulas);
		bTrigPythagorean = (Button) findViewById(R.id.bTrigPythagorean);
		bHalfAngleFormulas = (Button) findViewById(R.id.bHalfAngleFormulas);
		
		
		bTrigBasics.setOnClickListener(this);
		bTrigCommonAngles.setOnClickListener(this);
		bTrigPeriodicFormulas.setOnClickListener(this);
		bTrigPythagorean.setOnClickListener(this);
		bHalfAngleFormulas.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bTrigBasics:
			Intent TrigBasics = new Intent(this, FTrigonometryBasics.class);
			startActivity(TrigBasics);
		break;
		case R.id.bTrigCommonAngles:
			Intent TrigCommonAngles = new Intent(this, FTrigonometryCommonAngles.class);
		startActivity(TrigCommonAngles);
		break;
		case R.id.bTrigPeriodicFormulas:
			Intent TrigPeriodicFormulas = new Intent(this, FTrigonometryPeriodicFormulas.class);
		startActivity(TrigPeriodicFormulas);
		break;
		case R.id.bTrigPythagorean:
			Intent TrigPythagorean = new Intent(this, FTrigonometryPythagorean.class);
		startActivity(TrigPythagorean);
		break;
		case R.id.bHalfAngleFormulas:
			Intent HalfAngleFormulas = new Intent(this, FHalfAngleFormulas.class);
		startActivity(HalfAngleFormulas);
		break;
		
		}
		
	}
}
