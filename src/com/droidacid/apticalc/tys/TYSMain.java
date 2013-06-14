package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.R.id;
import com.droidacid.apticalc.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class TYSMain extends Activity implements OnClickListener,
		OnCheckedChangeListener {
	
	private final static int EASY = 0;
	private final static int MEDIUM = 1;
	private final static int HARD = 2;
	
	int mDifficultyType = EASY;

	final static String tag = "Test Your Skills";

	RadioGroup RgDiffLevel;
	Button BContinue, BHighScores;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testurskills);
		Initialize();
		
	}

	private void Initialize() {

		RgDiffLevel = (RadioGroup) findViewById(R.id.RgDiffLevel);
		BContinue = (Button) findViewById(R.id.BContinue);
		BHighScores = (Button) findViewById(R.id.BHighScores);
		
		RgDiffLevel.setOnCheckedChangeListener(this);
		BContinue.setOnClickListener(this);
		BHighScores.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.BContinue:
			Bundle difficulty = new Bundle();
			difficulty.putInt("difficulty", mDifficultyType);
			Intent Continue = new Intent(this, TYSMain1.class);
			Continue.putExtras(difficulty);
			startActivity(Continue);
		break;
		
		case R.id.BHighScores:
			Intent HighScores = new Intent(this, TYSHighScores.class);
			startActivity(HighScores);
		break;
		}

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		
		switch(checkedId){
		case R.id.RbEasy:
			mDifficultyType = EASY;
		break;
		case R.id.RbMedium:
			mDifficultyType = MEDIUM;
		break;
		case R.id.RbHard:
			mDifficultyType = HARD;
		break;
		}

	}

}
