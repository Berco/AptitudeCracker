package com.droidacid.apticalc;

import com.droidacid.more.More;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity implements android.view.View.OnClickListener{
	
	Button bapticalc, bformulas, btipsntricks, btesturskills, bmore;
	String tag = "Main Menu";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		initialize();	
		
	}
	
	private void initialize(){
		bapticalc = (Button) findViewById(R.id.bapticalc);
		btesturskills = (Button) findViewById(R.id.btesturskills);
		btipsntricks = (Button) findViewById(R.id.btipsntricks);
		bformulas = (Button) findViewById(R.id.bformulas);		
		bmore = (Button) findViewById(R.id.babout);
		
		bapticalc.setOnClickListener(this);
		btesturskills.setOnClickListener(this);
		btipsntricks.setOnClickListener(this);
		bformulas.setOnClickListener(this);
		bmore.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId())
		{
		case R.id.bapticalc:
			
			Intent Apti = new Intent(this, AptiCalc.class);
			startActivity(Apti);
			Log.d(tag, "Inside aptitude calc switch case");
			break;
		case R.id.btesturskills:
			
			Intent TestUrSkills = new Intent(this, TYSMain.class);
			startActivity(TestUrSkills);
			Log.d(tag, "Inside test your skills switch case");
			break;
		case R.id.btipsntricks:
			Intent TipsNTricks = new Intent(this, TipsNTricks.class);
			startActivity(TipsNTricks);
			Log.d(tag, "Inside tips and tricks switch case");
			break;
		case R.id.bformulas:
			Intent Formulas = new Intent(this, Formulas.class);
			startActivity(Formulas);
			Log.d(tag, "Inside formulas switch case");
			break;
		case R.id.bmore:
			Intent About = new Intent(this, More.class);
			startActivity(About);
			Log.d(tag, "Inside about switch case");
			break;
		
		}
	}
	
}
