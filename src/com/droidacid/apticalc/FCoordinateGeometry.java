package com.droidacid.apticalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FCoordinateGeometry extends Activity implements OnClickListener{

	Button bLineEqn, bLineDist, bLineMidPt, bLineSlope, 
	bSlopeParallelLines, bSlopePerLines, bCircleEqn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fcoordinate_geometry);
		initialize();
	}

	private void initialize() {
		
		bLineEqn = (Button) findViewById(R.id.bLineEqn);
		bLineDist = (Button) findViewById(R.id.bLineDist);
		bLineMidPt = (Button) findViewById(R.id.bLineMidPt);
		bLineSlope = (Button) findViewById(R.id.bLineSlope);
		bSlopeParallelLines = (Button) findViewById(R.id.bSlopeParallelLines);
		bSlopePerLines = (Button) findViewById(R.id.bSlopePerLines);
		bCircleEqn = (Button) findViewById(R.id.bCircleEqn);
		
		
		bLineEqn.setOnClickListener(this);
		bLineDist.setOnClickListener(this);
		bLineMidPt.setOnClickListener(this);
		bLineSlope.setOnClickListener(this);
		bSlopeParallelLines.setOnClickListener(this);
		bSlopePerLines.setOnClickListener(this);
		bCircleEqn.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bLineEqn:
			Intent LineEqn = new Intent(this, FLineEquation.class);
			startActivity(LineEqn);
		break;
		case R.id.bLineDist:
			Intent LineDist = new Intent(this, FLineDistance.class);
		startActivity(LineDist);
		break;
		case R.id.bLineMidPt:
			Intent LineMidPt = new Intent(this, FLineMidpoint.class);
		startActivity(LineMidPt);
		break;
		case R.id.bLineSlope:
			Intent LineSlope = new Intent(this, FLineSlope.class);
		startActivity(LineSlope);
		break;
		case R.id.bSlopeParallelLines:
			Intent SlopeParallelLines = new Intent(this, FSlopeParallelLines.class);
		startActivity(SlopeParallelLines);
		break;
		case R.id.bSlopePerLines:
			Intent SlopePerLines = new Intent(this, FSlopePerpendicularLines.class);
		startActivity(SlopePerLines);
		break;
		case R.id.bCircleEqn:
			Intent CircleEqn = new Intent(this, FCircleEquation.class);
		startActivity(CircleEqn);
		break;
		
		}
		
	}
}
