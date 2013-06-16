package com.droidacid.apticalc.formulas;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FAreasAndPerimeters extends Activity implements OnClickListener{

	Button bCircle, bTriangle, bEquiTriangle, bSquare, bRectangle, bParallel, bRing, bSector, bTrapezoid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fareas_and_perimeters);
		initialize();
	}

	private void initialize() {
		
		bCircle = (Button) findViewById(R.id.bCircle);
		bTriangle = (Button) findViewById(R.id.bTriangle);
		bEquiTriangle = (Button) findViewById(R.id.bEquiTri);
		bSquare = (Button) findViewById(R.id.bSquare);
		bRectangle = (Button) findViewById(R.id.bRectangle);
		bParallel = (Button) findViewById(R.id.bParallel);
		bRing = (Button) findViewById(R.id.bRing);
		bSector = (Button) findViewById(R.id.bSector);
		bTrapezoid = (Button) findViewById(R.id.bTrapezoid);
		
		
		bCircle.setOnClickListener(this);
		bTriangle.setOnClickListener(this);
		bEquiTriangle.setOnClickListener(this);
		bSquare.setOnClickListener(this);
		bRectangle.setOnClickListener(this);
		bParallel.setOnClickListener(this);
		bRing.setOnClickListener(this);
		bSector.setOnClickListener(this);
		bTrapezoid.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bCircle:
			Intent Circle = new Intent(this, FAreaCircle.class);
			startActivity(Circle);
		break;
		case R.id.bTriangle:
			Intent Triangle = new Intent(this, FAreaTriangle.class);
			startActivity(Triangle);
		break;
		case R.id.bEquiTri:
			Intent EquiTriangle = new Intent(this, FAreaEquilateralTriangle.class);
			startActivity(EquiTriangle);
		break;
		case R.id.bSquare:
			Intent GeoFund = new Intent(this, FAreaSquare.class);
			startActivity(GeoFund);
		break;
		case R.id.bRectangle:
			Intent Rectangle = new Intent(this, FAreaRectangle.class);
			startActivity(Rectangle);
		break;
		case R.id.bParallel:
			Intent Parallel = new Intent(this, FAreaParallogram.class);
			startActivity(Parallel);
		break;
		case R.id.bRing:
			Intent Ring = new Intent(this, FAreaRing.class);
			startActivity(Ring);
		break;
		case R.id.bSector:
			Intent Sector = new Intent(this, FAreaSector.class);
			startActivity(Sector);
		break;
		case R.id.bTrapezoid:
			Intent Trapezoid = new Intent(this, FAreaTrapezoid.class);
			startActivity(Trapezoid);
		break;
		
		}
		
	}
}
