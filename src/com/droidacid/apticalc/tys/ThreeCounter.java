package com.droidacid.apticalc.tys;

import java.util.concurrent.atomic.AtomicInteger;

import com.droidacid.apticalc.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ThreeCounter extends Activity {

	final static String tag = "Counter Class";
	TextView TvNumberOfQues, TvDifficultyType, TvQuestionsType;

	private final static int EASY = 0;
	private final static int MEDIUM = 1;
	private final static int HARD = 2;
	private static final int ADDITION = 0;
	private static final int SUBTRACT = 1;
	private static final int MULTIPLY = 2;
	private static final int DIVIDE = 3;
	private static final int ALL = 4;

	private int mDifficulty, mQuestions;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tys_three_counter);
		initialize();
		counterTimer();
		difficulty();
		questionType();
		

	}

	

	private void initialize() {

		Bundle DifficultyType = getIntent().getExtras();
		Bundle QuestionType = getIntent().getExtras();
		mDifficulty = DifficultyType.getInt("difficulty", 0);
		mQuestions = QuestionType.getInt("questionType", 0);
				

		TvNumberOfQues = (TextView) findViewById(R.id.TvNumberOfQues);
		TvDifficultyType = (TextView) findViewById(R.id.TvDifficultyType);
		TvQuestionsType = (TextView) findViewById(R.id.TvQuestionsType);

	}

	private void difficulty() {
		switch (mDifficulty) {
		case EASY:
			TvDifficultyType.setText("Easy");
			TvNumberOfQues.setText("Questions :10");
			break;
		case MEDIUM:
			TvDifficultyType.setText("Medium");
			TvNumberOfQues.setText("Questions :20");
			break;
		case HARD:
			TvDifficultyType.setText("Hard");
			TvNumberOfQues.setText("Questions :30");
			break;
		}
	}

	private void questionType() {
		switch (mQuestions) {
		case ADDITION:
			TvQuestionsType.setText("Addition");
			break;
		case SUBTRACT:
			TvQuestionsType.setText("Subtraction");
			break;
		case MULTIPLY:
			TvQuestionsType.setText("Multiplication");
			break;
		case DIVIDE:
			TvQuestionsType.setText("Division");
			break;
		case ALL:
			TvQuestionsType.setText("All");
			break;
		}
	}

	private void counterTimer() {
		final Handler handler = new Handler();
		final TextView TvCounter = (TextView) findViewById(R.id.TvCounter);
		final java.util.concurrent.atomic.AtomicInteger n = new AtomicInteger(3);
		final Context ThisContext = this;
		
		final Runnable counter = new Runnable() {
			@Override
			public void run() {

				TvCounter.setText(Integer.toString(n.get()));
				if (n.getAndDecrement() >= 1)
					handler.postDelayed(this, 1000);
				else {
					TvCounter.setVisibility(View.GONE);
					Log.d(tag, "Inside the Else Method of counter");
					
					Intent calculate = new Intent(ThisContext, FourCalculation.class);
					calculate.putExtra("difficulty", mDifficulty);
					calculate.putExtra("questionType", mQuestions);
					startActivity(calculate);
				}
			}
		};
		handler.postDelayed(counter, 1000);

	}

	@Override
	protected void onPause() {
		
		super.onPause();
		finish();
	}
}
