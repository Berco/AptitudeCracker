package com.droidacid.apticalc.formulas;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.R.id;
import com.droidacid.apticalc.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FCircleProperties extends Activity implements OnClickListener {

	Button bCircleProp1, bCircleProp2, bCircleProp3, bCircleProp4,
			bCircleProp5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fcircle_properties);
		initialize();
	}

	private void initialize() {

		bCircleProp1 = (Button) findViewById(R.id.bCircleProp1);
		bCircleProp2 = (Button) findViewById(R.id.bCircleProp2);
		bCircleProp3 = (Button) findViewById(R.id.bCircleProp3);
		bCircleProp4 = (Button) findViewById(R.id.bCircleProp4);
		bCircleProp5 = (Button) findViewById(R.id.bCircleProp5);

		bCircleProp1.setOnClickListener(this);
		bCircleProp2.setOnClickListener(this);
		bCircleProp3.setOnClickListener(this);
		bCircleProp4.setOnClickListener(this);
		bCircleProp5.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bCircleProp1:
			Intent CircleProp1 = new Intent(this, FCircleProperties1.class);
			startActivity(CircleProp1);
			break;
		case R.id.bCircleProp2:
			Intent CircleProp2 = new Intent(this, FCircleProperties2.class);
			startActivity(CircleProp2);
			break;
		case R.id.bCircleProp3:
			Intent CircleProp3 = new Intent(this, FCircleProperties3.class);
			startActivity(CircleProp3);
			break;
		case R.id.bCircleProp4:
			Intent CircleProp4 = new Intent(this, FCircleProperties4.class);
			startActivity(CircleProp4);
			break;
		case R.id.bCircleProp5:
			Intent CircleProp5 = new Intent(this, FCircleProperties5.class);
			startActivity(CircleProp5);
			break;

		}

	}
}
