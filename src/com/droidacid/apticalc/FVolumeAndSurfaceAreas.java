package com.droidacid.apticalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FVolumeAndSurfaceAreas extends Activity implements OnClickListener {

	Button bCone, bCube, bCylinder, bFrustum, bPyramid, bSphere;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fvolume_and_surface_areas);
		initialize();
	}

	private void initialize() {

		bCone = (Button) findViewById(R.id.bCone);
		bCube = (Button) findViewById(R.id.bCube);
		bCylinder = (Button) findViewById(R.id.bCylinder);
		bFrustum = (Button) findViewById(R.id.bFrustum);
		bPyramid = (Button) findViewById(R.id.bPyramid);
		bSphere = (Button) findViewById(R.id.bSphere);

		bCone.setOnClickListener(this);
		bCube.setOnClickListener(this);
		bCylinder.setOnClickListener(this);
		bFrustum.setOnClickListener(this);
		bPyramid.setOnClickListener(this);
		bSphere.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bCone:
			Intent Cone = new Intent(this, FVolumeCone.class);
			startActivity(Cone);
			break;
		case R.id.bCube:
			Intent Cube = new Intent(this, FVolumeCube.class);
			startActivity(Cube);
			break;
		case R.id.bCylinder:
			Intent Cylinder = new Intent(this, FVolumeCylinder.class);
			startActivity(Cylinder);
			break;
		case R.id.bFrustum:
			Intent Frustum = new Intent(this, FVolumeFrustrum.class);
			startActivity(Frustum);
			break;
		case R.id.bPyramid:
			Intent Pyramid = new Intent(this, FVolumePyramid.class);
			startActivity(Pyramid);
			break;
		case R.id.bSphere:
			Intent Sphere = new Intent(this, FVolumeSphere.class);
			startActivity(Sphere);
			break;
		}

	}
}
