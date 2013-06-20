package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.aptitudes.AptiFactorial;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TYSScores extends Activity implements OnClickListener {
	
	static final String tag = "Inside CalcScore";
	
	TextView RightAnswers, WrongAnswers, TotalScore;
	Button bHighScores, bPlayAgain;

	private int rightAns, wrongAns, score;
	String rightAnswer, wrongAnswer, myScore;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tys_scores);
		initialize();
	}

	private void initialize() {

		RightAnswers = (TextView) findViewById(R.id.Tv_tys_RightAnswers);
		WrongAnswers = (TextView) findViewById(R.id.Tv_tys_WrongAnswers);
		TotalScore = (TextView) findViewById(R.id.Tv_tys_TotalScore);
		bHighScores = (Button) findViewById(R.id.b_tys_HighScores);
		bPlayAgain = (Button) findViewById(R.id.b_tys_PlayAgain);
		
		bHighScores.setOnClickListener(this);
		bPlayAgain.setOnClickListener(this);
		
		Bundle getScore = getIntent().getExtras();
		rightAns = getScore.getInt("rightanswers");
		wrongAns = getScore.getInt("wronganswers");
		score = getScore.getInt("score");
		
		getValuesToString();
		
		setValuesToTextViews();
	}

	

	private void getValuesToString() {
		Log.d(tag, "inside getValuesToString method");
		rightAnswer = Integer.toString(rightAns);
		wrongAnswer = Integer.toString(wrongAns);
		myScore = Integer.toString(score);
		
	}

	private void setValuesToTextViews() {
		Log.d(tag, "inside setValuesToTextViews method");
		RightAnswers.setText("Right Answers : " + rightAnswer);
		WrongAnswers.setText("Wrong Answers : " + wrongAnswer);
		TotalScore.setText("Total Score : " + myScore);
		
	}

	

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.b_tys_HighScores:
			Intent highScore = new Intent(this, HighScores.class);
			startActivity(highScore);
		break;
		case R.id.b_tys_PlayAgain:
			
			Intent playAgain = new Intent(this, OneDifficulty.class);
			startActivity(playAgain);
		break;
		}
	}

	@Override
	protected void onPause() {
		
		super.onPause();
		finish();
	}

}