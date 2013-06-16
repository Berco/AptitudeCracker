package com.droidacid.apticalc.formulas;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Formulas extends Activity implements OnClickListener{

	Button bSquaresCubes, bDivisibility, bExponents, bLogs, 
	bProgressions, bQuadraticEqs, bProbabilityPnC, bGeometry, 
	bCoOrdinateGeo, bTrigonometry;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formulas);
		initialize();
	}

	private void initialize() {
		
		bSquaresCubes = (Button) findViewById(R.id.bSqrscubes);
		bDivisibility = (Button) findViewById(R.id.bDivisibility);
		bExponents = (Button) findViewById(R.id.bExponents);
		bLogs = (Button) findViewById(R.id.bLogs);
		bProgressions = (Button) findViewById(R.id.bProgressions);
		bQuadraticEqs = (Button) findViewById(R.id.bQuadraticeqs);
		bProbabilityPnC = (Button) findViewById(R.id.bProbabilityPnC);
		bGeometry = (Button) findViewById(R.id.bGeometry);
		bCoOrdinateGeo = (Button) findViewById(R.id.bCoOrdinateGeo);
		bTrigonometry = (Button) findViewById(R.id.bTrigonometry);
		
		bSquaresCubes.setOnClickListener(this);
		bDivisibility.setOnClickListener(this);
		bExponents.setOnClickListener(this);
		bLogs.setOnClickListener(this);
		bProgressions.setOnClickListener(this);
		bQuadraticEqs.setOnClickListener(this);
		bProbabilityPnC.setOnClickListener(this);
		bGeometry.setOnClickListener(this);
		bCoOrdinateGeo.setOnClickListener(this);
		bTrigonometry.setOnClickListener(this);		
		
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.bSqrscubes:
			Intent SquaresCubesFractions = new Intent(this, FSquaresCubesFractions.class);
			startActivity(SquaresCubesFractions);
		break;
		case R.id.bDivisibility:
			Intent Divisibility = new Intent(this, FDivisibilityRule.class);
			startActivity(Divisibility);
			break;
		case R.id.bExponents:
			Intent Exponents = new Intent(this, FExponents.class);
			startActivity(Exponents);
			break;
		case R.id.bLogs:
			Intent Logs = new Intent(this, FLogarithms.class);
			startActivity(Logs);
			break;
		case R.id.bProgressions:
			Intent Progressions = new Intent(this, FProgressions.class);
			startActivity(Progressions);
			break;
		case R.id.bQuadraticeqs:
			Intent Quadratic = new Intent(this, FQuadratic.class);
			startActivity(Quadratic);
			break;
		case R.id.bProbabilityPnC:
			Intent ProbabilityPnC = new Intent(this, FProbabilityPandC.class);
			startActivity(ProbabilityPnC);
			break;
		case R.id.bGeometry:
			Intent Geometry = new Intent(this, FGeometry.class);
			startActivity(Geometry);
			break;
			case R.id.bCoOrdinateGeo:
			Intent CoOrdinateGeo = new Intent(this, FCoordinateGeometry.class);
			startActivity(CoOrdinateGeo);
			break;
		case R.id.bTrigonometry:
			Intent Trigonometry = new Intent(this, FTrigonometry.class);
			startActivity(Trigonometry);
			break;
		
		}
		
	}
	
	

}
