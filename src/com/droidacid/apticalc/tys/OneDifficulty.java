package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class OneDifficulty extends Activity implements OnClickListener,
		OnCheckedChangeListener {
	
	private final static int EASY = 0;
	private final static int MEDIUM = 1;
	private final static int HARD = 2;
	
	int mDifficultyType = EASY;

	final static String tag = "Test Your Skills";

	RadioGroup RgDiffLevel;
	Button bContinue, bHighScores;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tys_one_dificulty);
		Initialize();
		
	}

	private void Initialize() {

		RgDiffLevel = (RadioGroup) findViewById(R.id.RgDiffLevel);
		bContinue = (Button) findViewById(R.id.bContinue);
		bHighScores = (Button) findViewById(R.id.bHighScores);
		
		RgDiffLevel.setOnCheckedChangeListener(this);
		bContinue.setOnClickListener(this);
		bHighScores.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.bContinue:
			Log.d(tag, "Inside On Click Continue button");
			Bundle basket = new Bundle();
			basket.putInt("difficulty", mDifficultyType);
			Intent Continue = new Intent(this, TwoLevel.class);
			Continue.putExtras(basket);
			startActivity(Continue);
		break;
		
		case R.id.bHighScores:
			Intent HighScores = new Intent(this, HighScores.class);
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
