package com.droidacid.apticalc;

import com.droidacid.apticalc.aptitudes.AptiCalc;
import com.droidacid.apticalc.formulas.Formulas;
import com.droidacid.apticalc.more.More;
import com.droidacid.apticalc.tipsandtricks.TipsNdTricks;
import com.droidacid.apticalc.tys.OneDifficulty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity implements android.view.View.OnClickListener{
	
	Button b_main_apticalc, b_main_formulas, b_main_tipsntricks,
	b_main_testurskills, b_main_more;
	//String tag = "Main Menu";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		initialize();	
		
	}
	
	private void initialize(){
		b_main_apticalc = (Button) findViewById(R.id.b_main_apticalc);
		b_main_testurskills = (Button) findViewById(R.id.b_main_testurskills);
		b_main_tipsntricks = (Button) findViewById(R.id.b_main_tipsntricks);
		b_main_formulas = (Button) findViewById(R.id.b_main_formulas);		
		b_main_more = (Button) findViewById(R.id.b_main_more);
		
		b_main_apticalc.setOnClickListener(this);
		b_main_testurskills.setOnClickListener(this);
		b_main_tipsntricks.setOnClickListener(this);
		b_main_formulas.setOnClickListener(this);
		b_main_more.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId())
		{
		case R.id.bapticalc:
			
			Intent Apti = new Intent(this, AptiCalc.class);
			startActivity(Apti);
			//Log.d(tag, "Inside aptitude calc switch case");
			break;
		case R.id.b_main_testurskills:
			
			Intent TestUrSkills = new Intent(this, OneDifficulty.class);
			startActivity(TestUrSkills);
			//Log.d(tag, "Inside test your skills switch case");
			break;
		case R.id.b_main_tipsntricks:
			Intent TipsNTricks = new Intent(this, TipsNdTricks.class);
			startActivity(TipsNTricks);
			//Log.d(tag, "Inside tips and tricks switch case");
			break;
		case R.id.b_main_formulas:
			Intent Formulas = new Intent(this, Formulas.class);
			startActivity(Formulas);
			//Log.d(tag, "Inside formulas switch case");
			break;
		case R.id.b_main_more:
			Intent About = new Intent(this, More.class);
			startActivity(About);
			//Log.d(tag, "Inside about switch case");
			break;
		
		}
	}
	
}
