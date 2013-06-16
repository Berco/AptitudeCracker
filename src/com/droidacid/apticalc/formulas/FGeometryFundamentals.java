package com.droidacid.apticalc.formulas;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FGeometryFundamentals extends Activity implements OnClickListener {

	Button bGeoFund1, bGeoFund2, bGeoFund3, bGeoFund4, bGeoFund5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fgeometry_fundamentals);
		initialize();
	}

	private void initialize() {

		bGeoFund1 = (Button) findViewById(R.id.bGeoFund1);
		bGeoFund2 = (Button) findViewById(R.id.bGeoFund2);
		bGeoFund3 = (Button) findViewById(R.id.bGeoFund3);
		bGeoFund4 = (Button) findViewById(R.id.bGeoFund4);
		bGeoFund5 = (Button) findViewById(R.id.bGeoFund5);
		
		

		bGeoFund1.setOnClickListener(this);
		bGeoFund2.setOnClickListener(this);
		bGeoFund3.setOnClickListener(this);
		bGeoFund4.setOnClickListener(this);
		bGeoFund5.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bGeoFund1:
			Intent GeoFund1 = new Intent(this, FGeometry1.class);
			startActivity(GeoFund1);
		break;
		case R.id.bGeoFund2:
			Intent GeoFund2 = new Intent(this, FGeometry2.class);
			startActivity(GeoFund2);
		break;
		case R.id.bGeoFund3:
			Intent GeoFund3 = new Intent(this, FGeometry3.class);
			startActivity(GeoFund3);
		break;
		case R.id.bGeoFund4:
			Intent GeoFund4 = new Intent(this, FGeometry4.class);
			startActivity(GeoFund4);
		break;
		case R.id.bGeoFund5:
			Intent GeoFund5 = new Intent(this, FGeometry5.class);
			startActivity(GeoFund5);
		break;
		}

	}
}
