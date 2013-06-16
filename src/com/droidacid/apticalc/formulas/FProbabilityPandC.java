package com.droidacid.apticalc.formulas;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FProbabilityPandC extends Activity implements OnClickListener
{
	Button bProbability, bBinomial, bCounting;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fprobability_pand_c);
		initialize();
	}

	private void initialize() {
		
		bProbability = (Button) findViewById(R.id.bProbability);
		bBinomial = (Button) findViewById(R.id.bBinomial);
		bCounting = (Button) findViewById(R.id.bCounting);
		
		bProbability.setOnClickListener(this);
		bBinomial.setOnClickListener(this);
		bCounting.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.bProbability:
			Intent intent = new Intent(this, FProbability.class);
			startActivity(intent);
			break;
		case R.id.bBinomial:
			Intent Binomial = new Intent(this, FBinomial.class);
			startActivity(Binomial);
			break;
		case R.id.bCounting:
			Intent Counting = new Intent(this, FCount.class);
			startActivity(Counting);
			break;
	
		
		}
		
	}
  
}
