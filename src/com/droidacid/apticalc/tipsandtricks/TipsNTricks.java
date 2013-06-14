package com.droidacid.apticalc.tipsandtricks;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.R.id;
import com.droidacid.apticalc.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TipsNTricks extends Activity implements OnClickListener{
	static final String tag= "tipsNTricks"; 
	Button btntnumsys;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tipsntricks);
		initialize();
		btntnumsys.setOnClickListener(this);
		Log.d(tag, "BTNTNUMSYS button error");
	}
	
	private void initialize(){
		btntnumsys = (Button) findViewById(R.id.btntnumsys);
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId())
		{
		case R.id.btntnumsys:
			startActivity(new Intent("com.droidacid.apticalc.TNTNUMSYS"));
		break;
		}
		
	}

	
	
}
