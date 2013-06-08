package com.droidacid.apticalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FGeometry extends Activity implements OnClickListener{

	Button bGeoFund, bAreaNPeri, bVolNSurf, bCircleprop, bTriProp, bQuadProp, bPentProp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fgeometry);
		initialize();
	}

	private void initialize() {
		
		bGeoFund = (Button) findViewById(R.id.bGeoFund);
		bAreaNPeri = (Button) findViewById(R.id.bAreaNPeri);
		bVolNSurf = (Button) findViewById(R.id.bVolNSurf);
		bCircleprop = (Button) findViewById(R.id.bCircleProp);
		bTriProp = (Button) findViewById(R.id.bTriProp);
		bQuadProp = (Button) findViewById(R.id.bQuadProp);
		bPentProp = (Button) findViewById(R.id.bPentProp);
		
		bGeoFund.setOnClickListener(this);
		bAreaNPeri.setOnClickListener(this);
		bVolNSurf.setOnClickListener(this);
		bCircleprop.setOnClickListener(this);
		bTriProp.setOnClickListener(this);
		bQuadProp.setOnClickListener(this);
		bPentProp.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bGeoFund:
			Intent GeoFund = new Intent(this, FGeometryFundamentals.class);
			startActivity(GeoFund);
		break;
		case R.id.bAreaNPeri:
			Intent AreaAndPerimeter = new Intent(this, FAreasAndPerimeters.class);
		startActivity(AreaAndPerimeter);
		break;
		case R.id.bVolNSurf:
			Intent VolumeNSurface = new Intent(this, FVolumeAndSurfaceAreas.class);
		startActivity(VolumeNSurface);
		break;
		case R.id.bCircleProp:
			Intent CircleProp = new Intent(this, FCircleProperties.class);
		startActivity(CircleProp);
		break;
		case R.id.bTriProp:
			Intent TriProp = new Intent(this, FTriangleProperties.class);
		startActivity(TriProp);
		break;
		case R.id.bQuadProp:
			Intent QuadProp = new Intent(this, FQuadrilateralProperties.class);
		startActivity(QuadProp);
		break;
		case R.id.bPentProp:
			Intent PentProp = new Intent(this, FPentagonProperties.class);
		startActivity(PentProp);
		break;
		}
		
	}
}
