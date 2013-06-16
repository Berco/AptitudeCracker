package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShivamD on 5/19/13.
 */
public class AptiInterest extends Activity implements View.OnClickListener {

	Button sInterest, cInterest;
	String tag = "aptiInterest Class";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aptiinterest);
		initialize();
	}

	protected void initialize() {
		sInterest = (Button) findViewById(R.id.bsimpleint);
		cInterest = (Button) findViewById(R.id.bcompoundint);
		sInterest.setOnClickListener(this);
		cInterest.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.bsimpleint:
			Intent SimpleInt = new Intent(this, AptiSimpleInt.class);
			startActivity(SimpleInt);
			break;
		case R.id.bcompoundint:
			Intent CompoundInt = new Intent(this, AptiCompoundInt.class);
			startActivity(CompoundInt);
			Log.d(tag, "Compound Interest button is pressed.");
			break;
		}
	}
}
