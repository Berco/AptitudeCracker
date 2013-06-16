package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;

import android.app.Activity;
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

		RightAnswers = (TextView) findViewById(R.id.TvRightAnswers);
		WrongAnswers = (TextView) findViewById(R.id.TvWrongAnswers);
		TotalScore = (TextView) findViewById(R.id.TvTotalScore);
		bHighScores = (Button) findViewById(R.id.bHighScores);
		bPlayAgain = (Button) findViewById(R.id.bPlayAgain);
		
		bHighScores.setOnClickListener(this);
		
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
		case R.id.bHighScores:
			
		break;
		case R.id.bPlayAgain:
			
		break;
		}
	}

	@Override
	protected void onPause() {
		
		super.onPause();
		finish();
	}

}