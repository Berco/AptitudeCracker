package com.droidacid.apticalc.tys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.tys.model.ScoreEntry;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
		
		if (isHighScore(score)) saveScore(score);
		
		getValuesToString();
		
		setValuesToTextViews();
	}

	

	private void saveScore(int score) {
		Toast.makeText(this, "HighScore!!!", Toast.LENGTH_LONG).show();
		
		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		int numberEntries = getPrefs.getInt("entries", 0);
		ScoreEntry newEntry = new ScoreEntry("shivam", score);
		List<ScoreEntry> entries = new ArrayList<ScoreEntry>(numberEntries);
		for (int i = 1;  i <= numberEntries ; i++){
			String high = getPrefs.getString("high_"+Integer.toString(i), "name,12");
			String[] highA = high.split(",");
			ScoreEntry entry = new ScoreEntry(highA[0], Integer.valueOf(highA[1]));
			entries.add(entry);
		}
		Collections.sort(entries);
		if (entries.size() < 5){
			entries.add(newEntry);
		} else {
			entries.remove(entries.size()-1);
			entries.add(newEntry);
		}
		Collections.sort(entries);
		
		Editor editor = getPrefs.edit();
		for (int i = 1; i < entries.size(); i++){
			String aName= entries.get(i).getName();
			String aScore = Integer.toString(entries.get(i).getScore());
			editor.putString("high_"+Integer.toString(i), aName+","+aScore);
		}
		editor.putInt("entries", entries.size());
        editor.commit();
	}

	private boolean isHighScore(int score) {
		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		int numberEntries = getPrefs.getInt("entries", 0);
		Log.d(tag, "entries = " + Integer.toString(numberEntries));
		// only check if there are entries to be compared with
		if (numberEntries > 0){
			// if we have less than 6 entries, also a new high score
			if (numberEntries < 6) return true;
			
			List<ScoreEntry> entries = new ArrayList<ScoreEntry>(numberEntries);
			for (int i = 1;  i <= numberEntries ; i++){
				String high = getPrefs.getString("high_"+Integer.toString(i), "name,12");
				String[] highA = high.split(",");
				ScoreEntry entry = new ScoreEntry(highA[0], Integer.valueOf(highA[1]));
				entries.add(entry);
			}
			Collections.sort(entries);
			// higher than the lowest one known
			if ((score >= entries.get(entries.size()-1).getScore()) ){
				int oldHighest = entries.get(entries.size()-1).getScore();
				Log.d(tag, "new HighScore: "+ Integer.toString(score)+ " ,higher than " + Integer.toString(oldHighest));
				return true;
			}
			// this score was not higher than the lowest one known
			return false;
		} else {
			// this score was the first score ever! 
			return true;
		}
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