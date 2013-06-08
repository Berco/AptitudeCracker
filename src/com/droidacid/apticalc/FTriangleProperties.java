package com.droidacid.apticalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FTriangleProperties extends Activity implements OnClickListener{

	Button bTriProp1, bTriProp2, bTriProp3, bTriProp4, 
	bTriProp5, bTriProp6, bTriProp7, bTriProp8, bTriProp9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ftriangle_properties);
		initialize();
	}

	private void initialize() {
		
		bTriProp1 = (Button) findViewById(R.id.bTriProp1);
		bTriProp2 = (Button) findViewById(R.id.bTriProp2);
		bTriProp3 = (Button) findViewById(R.id.bTriProp3);
		bTriProp4 = (Button) findViewById(R.id.bTriProp4);
		bTriProp5 = (Button) findViewById(R.id.bTriProp5);
		bTriProp6 = (Button) findViewById(R.id.bTriProp6);
		bTriProp7 = (Button) findViewById(R.id.bTriProp7);
		bTriProp8 = (Button) findViewById(R.id.bTriProp8);
		bTriProp9 = (Button) findViewById(R.id.bTriProp9);
		
		bTriProp1.setOnClickListener(this);
		bTriProp2.setOnClickListener(this);
		bTriProp3.setOnClickListener(this);
		bTriProp4.setOnClickListener(this);
		bTriProp5.setOnClickListener(this);
		bTriProp6.setOnClickListener(this);
		bTriProp7.setOnClickListener(this);
		bTriProp8.setOnClickListener(this);
		bTriProp9.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bTriProp1:
			Intent TriProp1 = new Intent(this, FTriangle1.class);
			startActivity(TriProp1);
		break;
		case R.id.bTriProp2:
			Intent TriProp2 = new Intent(this, FTriangle2.class);
		startActivity(TriProp2);
		break;
		case R.id.bTriProp3:
			Intent bTriProp3 = new Intent(this, FTriangle3.class);
		startActivity(bTriProp3);
		break;
		case R.id.bTriProp4:
			Intent TriProp4 = new Intent(this, FTriangle4.class);
		startActivity(TriProp4);
		break;
		case R.id.bTriProp5:
			Intent TriProp5 = new Intent(this, FTriangle5.class);
		startActivity(TriProp5);
		break;
		case R.id.bTriProp6:
			Intent TriProp6 = new Intent(this, FTriangle6.class);
		startActivity(TriProp6);
		break;
		case R.id.bTriProp7:
			Intent TriProp7 = new Intent(this, FTriangle7.class);
		startActivity(TriProp7);
		break;
		case R.id.bTriProp8:
			Intent TriProp8 = new Intent(this, FTriangle8.class);
		startActivity(TriProp8);
		break;
		case R.id.bTriProp9:
			Intent TriProp9 = new Intent(this, FTriangle9.class);
		startActivity(TriProp9);
		break;
		}
		
	}
}
