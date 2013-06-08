package com.droidacid.apticalc;

import java.util.concurrent.atomic.AtomicInteger;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class TYS_Counter extends Activity {

	TextView TvNumberOfQues, TvDifficultyType, TvQuestionsType;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tyscounter);
		Initialize();
	}

	private void Initialize() {
		
		TvNumberOfQues = (TextView) findViewById(R.id.TvNumberOfQues);
		TvDifficultyType = (TextView) findViewById(R.id.TvDifficultyType);
		TvQuestionsType = (TextView) findViewById(R.id.TvQuestionsType);
		
		

	/*	if (mDifficultyType == EASY) howDifficult = "Easy";
		if (mDifficultyType == MEDIUM) howDifficult = "Medium";
		if (mDifficultyType == HARD) howDifficult = "Hard";
	*/
	}
	

}
