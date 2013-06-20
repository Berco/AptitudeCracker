package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HighScores extends Activity {

	TextView tvHighScore;
	private static String SCORE_KEY = "savedScore";
	String myScore;
	int score;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tys_high_score);
		tvHighScore = (TextView) findViewById(R.id.tv_tys_score);
		getScore();
		setScore();
			
	}
	private void getScore() {
		Bundle getScore = getIntent().getExtras();
		score = getScore.getInt("score");				// getting error with this NullPointerException
		//myScore = Integer.toString(score);
		//setScore(score);
		getScores(score);
	}
	
	private void getScores(int score) {
		SharedPreferences saveScore = getSharedPreferences("saveScores", MODE_PRIVATE);
		SharedPreferences.Editor editor = saveScore.edit();
		editor.putInt(SCORE_KEY, score);
		editor.commit();
	}
	private void setScore() {
		if (tvHighScore.getText().toString().equals("")) tvHighScore.setText("0");
		int scoreSaved = Integer.parseInt(tvHighScore.getText().toString());
		if (scoreSaved > score){
			tvHighScore.setText(scoreSaved);
		}
		else{
			SharedPreferences saveScore = getSharedPreferences("saveScores", MODE_PRIVATE);
			tvHighScore.setText(saveScore.getString(SCORE_KEY, ""));
		}
		
		
	}

	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
