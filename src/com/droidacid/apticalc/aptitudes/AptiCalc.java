package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AptiCalc extends Activity implements View.OnClickListener {

	
	Button bnumsys, bpercent, btimenwork, btimedist, binterest, blcmhcf,
			bareavolume;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.apticalc);
		initialize();
	}

	private void initialize() {
		bnumsys = (Button) findViewById(R.id.b_apti_numsys);
		bpercent = (Button) findViewById(R.id.b_apti_percent);
		btimenwork = (Button) findViewById(R.id.b_apti_timenwork);
		btimedist = (Button) findViewById(R.id.b_apti_timendist);
		binterest = (Button) findViewById(R.id.b_apti_interest);
		blcmhcf = (Button) findViewById(R.id.b_apti_lcmhcf);

		bnumsys.setOnClickListener(this);
		bpercent.setOnClickListener(this);
		btimenwork.setOnClickListener(this);
		btimedist.setOnClickListener(this);
		binterest.setOnClickListener(this);
		blcmhcf.setOnClickListener(this);

	}

	@Override
	public void onClick(View button) {
		// Switch case for buttons
		
	switch(button.getId())
	{
	case R.id.b_apti_numsys:
		Intent NumSys = new Intent(this, AptiNumSys.class);
		startActivity(NumSys);
		break;
	case R.id.b_apti_percent:
		Intent Percentage = new Intent(this, AptiPercent.class);
		startActivity(Percentage);
		break;
	case R.id.b_apti_timenwork:
		Intent TimeNWork = new Intent(this, AptiTimeNWork.class);
		startActivity(TimeNWork);
		break;
	case R.id.b_apti_timendist:
		Intent TimeDist = new Intent(this, AptiTimeDist.class);
		startActivity(TimeDist);
		break;
    case R.id.b_apti_interest:
    	Intent Interest = new Intent(this, AptiInterest.class);
        startActivity(Interest);
        break;
    case R.id.b_apti_lcmhcf:
    	Intent LCMHCF = new Intent(this, AptiLcmHcf.class);
        startActivity(LCMHCF);
        break;

	}
		
		
	}
}
