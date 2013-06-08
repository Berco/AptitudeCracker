package com.droidacid.apticalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FSquaresCubesFractions extends Activity implements OnClickListener
{
	Button bSquares, bCubes, bDecimals;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fsquares_cubes_fractions);
		initialize();
	}

	private void initialize() {
		
		bSquares = (Button) findViewById(R.id.bSquares);
		bCubes = (Button) findViewById(R.id.bCubes);
		bDecimals = (Button) findViewById(R.id.bDecimal);
		
		bSquares.setOnClickListener(this);
		bCubes.setOnClickListener(this);
		bDecimals.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.bSquares:
			Intent Squares = new Intent(this, FSquares.class);
			startActivity(Squares);
			break;
		case R.id.bCubes:
			Intent Cubes = new Intent(this, FCubes.class);
			startActivity(Cubes);
			break;
		case R.id.bDecimal:
			Intent Decimals = new Intent(this, FDecimals.class);
			startActivity(Decimals);
			break;
	
		
		}
		
	}
  
}
