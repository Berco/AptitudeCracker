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

		RgDiffLevel = (RadioGroup) findViewById(R.id.Rg_tys_DiffLevel);
		bContinue = (Button) findViewById(R.id.b_tys_Continue);
		bHighScores = (Button) findViewById(R.id.b_tys_HighScores);
		
		RgDiffLevel.setOnCheckedChangeListener(this);
		bContinue.setOnClickListener(this);
		bHighScores.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.b_tys_Continue:
			Log.d(tag, "Inside On Click Continue button");
			Bundle basket = new Bundle();
			basket.putInt("difficulty", mDifficultyType);
			Intent Continue = new Intent(this, TwoLevel.class);
			Continue.putExtras(basket);
			startActivity(Continue);
		break;
		
		case R.id.b_tys_HighScores:
			Intent HighScores = new Intent(this, HighScores.class);
			startActivity(HighScores);
		break;
		}

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		
		switch(checkedId){
		case R.id.Rb_tys_Easy:
			mDifficultyType = EASY;
		break;
		case R.id.Rb_tys_Medium:
			mDifficultyType = MEDIUM;
		break;
		case R.id.Rb_tys_Hard:
			mDifficultyType = HARD;
		break;
		}

	}

	@Override
	protected void onPause() {
	
		super.onPause();
		finish();
	}

}
