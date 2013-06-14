package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.R.id;
import com.droidacid.apticalc.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AptiCalc extends Activity implements View.OnClickListener {

	String tag = "Aptitude Calculator";
	Button bnumsys, bpercent, btimenwork, btimedist, binterest, blcmhcf,
			bareavolume;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.apticalc);
		initialize();
	}

	private void initialize() {
		bnumsys = (Button) findViewById(R.id.bnumsys);
		bpercent = (Button) findViewById(R.id.bpercent);
		btimenwork = (Button) findViewById(R.id.btimenwork);
		btimedist = (Button) findViewById(R.id.btimendist);
		binterest = (Button) findViewById(R.id.binterest);
		blcmhcf = (Button) findViewById(R.id.blcmhcf);

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
	case R.id.bnumsys:
		Intent NumSys = new Intent(this, AptiNumSys.class);
		startActivity(NumSys);
		break;
	case R.id.bpercent:
		Intent Percentage = new Intent(this, AptiPercent.class);
		startActivity(Percentage);
		break;
	case R.id.btimenwork:
		Intent TimeNWork = new Intent(this, AptiTimeNWork.class);
		startActivity(TimeNWork);
		break;
	case R.id.btimendist:
		Intent TimeDist = new Intent(this, AptiTimeDist.class);
		startActivity(TimeDist);
		break;
    case R.id.binterest:
    	Intent Interest = new Intent(this, AptiInterest.class);
        startActivity(Interest);
        break;
    case R.id.blcmhcf:
    	Intent LCMHCF = new Intent(this, AptiLcmHcf.class);
        startActivity(LCMHCF);
        break;

	}
		
		
	}
}
