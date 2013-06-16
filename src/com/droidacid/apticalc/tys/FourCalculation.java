package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.tys.model.Question;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FourCalculation extends Activity implements OnClickListener {
	private static final String TAG = "CalculationActivity";

	Button BOne, BTwo, BThree, BFour, BFive, BSix, BSeven, BEight, BNine,
			BZero, BClear;
	TextView TvQuestions, TvAnswers, TvTimer, TvNumberOfQuestions;

	private CountDownTimer timer;

	private final static int EASY = 0;
	private final static int MEDIUM = 1;
	private final static int HARD = 2;
	private static final int ADDITION = 0;
	private static final int SUBTRACT = 1;
	private static final int MULTIPLY = 2;
	private static final int DIVIDE = 3;
	private static final int ALL = 4;

	int randomValue = (int) Math.random();
	int availableTime = 30;
	int Num1, Num2, Result, RightAnswers, WrongAnswers, timeTaken;

	long starttime = 0;
	boolean timerGoingUp = true;
	boolean timerRunning;
	Timer upTimer = new Timer();

	private int mDifficulty, mQuestions;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tys_four_calculate);
		Initialize();
		Questions();
		startTimer();
	}

	private void Initialize() {
		Bundle getBasket = getIntent().getExtras();
		Bundle basket = getIntent().getExtras();
		mDifficulty = getBasket.getInt("difficulty", 0);
		mQuestions = basket.getInt("questionType", 0);

		String howDifficult;
		String QuestionType;

		if (mDifficulty == EASY)
			howDifficult = "Easy";
		if (mDifficulty == MEDIUM)
			howDifficult = "Medium";
		if (mDifficulty == HARD)
			howDifficult = "Hard";

		if (mQuestions == ADDITION)
			QuestionType = "Addition";
		if (mQuestions == SUBTRACT)
			QuestionType = "Subtraction";
		if (mQuestions == MULTIPLY)
			QuestionType = "Multiplication";
		if (mQuestions == DIVIDE)
			QuestionType = "Division";
		if (mQuestions == ALL)
			QuestionType = "All";

		TvQuestions = (TextView) findViewById(R.id.TvQuestions);
		TvTimer = (TextView) findViewById(R.id.TvTimer);
		TvAnswers = (TextView) findViewById(R.id.TvAnswers);
		TvNumberOfQuestions = (TextView) findViewById(R.id.TvNumberOfQuestions);

		BOne = (Button) findViewById(R.id.B1);
		BTwo = (Button) findViewById(R.id.B2);
		BThree = (Button) findViewById(R.id.B3);
		BFour = (Button) findViewById(R.id.B4);
		BFive = (Button) findViewById(R.id.B5);
		BSix = (Button) findViewById(R.id.B6);
		BSeven = (Button) findViewById(R.id.B7);
		BEight = (Button) findViewById(R.id.B8);
		BNine = (Button) findViewById(R.id.B9);
		BZero = (Button) findViewById(R.id.B0);
		BClear = (Button) findViewById(R.id.BClear);

		BOne.setOnClickListener(this);
		BTwo.setOnClickListener(this);
		BThree.setOnClickListener(this);
		BFour.setOnClickListener(this);
		BFive.setOnClickListener(this);
		BSix.setOnClickListener(this);
		BSeven.setOnClickListener(this);
		BEight.setOnClickListener(this);
		BNine.setOnClickListener(this);
		BZero.setOnClickListener(this);
		BClear.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (!timerRunning)
			return;

		switch (v.getId()) {
		case R.id.B1:
			TvAnswers.setText(TvAnswers.getText().toString() + "1");
			break;
		case R.id.B2:
			TvAnswers.setText(TvAnswers.getText().toString() + "2");
			break;
		case R.id.B3:
			TvAnswers.setText(TvAnswers.getText().toString() + "3");
			break;
		case R.id.B4:
			TvAnswers.setText(TvAnswers.getText().toString() + "4");
			break;
		case R.id.B5:
			TvAnswers.setText(TvAnswers.getText().toString() + "5");
			break;
		case R.id.B6:
			TvAnswers.setText(TvAnswers.getText().toString() + "6");
			break;
		case R.id.B7:
			TvAnswers.setText(TvAnswers.getText().toString() + "7");
			break;
		case R.id.B8:
			TvAnswers.setText(TvAnswers.getText().toString() + "8");
			break;
		case R.id.B9:
			TvAnswers.setText(TvAnswers.getText().toString() + "9");
			break;
		case R.id.B0:
			TvAnswers.setText(TvAnswers.getText().toString() + "0");
			break;
		case R.id.BClear:
			if (TvAnswers.getText().length() > 0) {
				String txt = TvAnswers.getText().toString();
				TvAnswers.setText(txt.substring(0, txt.length() - 1));
			}
			break;
		}

		if (TvAnswers.getText().length() == String.valueOf(Result).length()) {
			VerifyAnswer();
		}

	}

	private void Questions() {
		int numberOfQuestions = 0;
		switch (mDifficulty) {
		case EASY:
			numberOfQuestions = 10;
			break;
		case MEDIUM:
			numberOfQuestions = 15;
			break;
		case HARD:
			numberOfQuestions = 20;
			break;
		}
		Log.w(TAG, "new set questions");
		if ((RightAnswers + WrongAnswers) >= numberOfQuestions) {
			calculateScore();
			
			return;
		}

		Question mQuestion = new Question(mQuestions, mDifficulty);
		TvQuestions.setText(mQuestion.getCalculation());
		Result = mQuestion.getResult();
	}

	public void VerifyAnswer() {
		
		if (Result == Integer.valueOf((String) TvAnswers.getText())) {
			RightAnswers++;
			TvNumberOfQuestions.setText(Integer.toString(RightAnswers) + "/"
					+ Integer.toString(RightAnswers + WrongAnswers));
			TvNumberOfQuestions.setTextColor(Color.GREEN);
		} else {
			WrongAnswers++;
			TvNumberOfQuestions.setText(Integer.toString(RightAnswers) + "/"
					+ Integer.toString(RightAnswers + WrongAnswers));
			TvNumberOfQuestions.setTextColor(Color.RED);
		}

		TvAnswers.setText("");
		Questions();
	}

	private void calculateScore() {
		int score = 0;
		if (timerGoingUp) {
			score = (10 * (RightAnswers) - 5 * (WrongAnswers))- timeTaken;
		} else {
			score = (10 * (RightAnswers) - 5 * (WrongAnswers)) + Integer.valueOf(TvTimer.getText().toString());
		}

		stopTimer();
		scoreActivity(score);
		RightAnswers = 0;
		WrongAnswers = 0;
	}

	private void scoreActivity(int score) {
		Intent scoresCalc = new Intent(this, TYSScores.class);
		Bundle scored = new Bundle();
		scored.putInt("rightanswers", RightAnswers);
		scored.putInt("wronganswers", WrongAnswers);
		scored.putInt("score", score);

		scoresCalc.putExtras(scored);
		startActivity(scoresCalc);
		
	}

	private void stopTimer() {
		upTimer.cancel();
		upTimer.purge();
		if (timer != null)
			timer.cancel();
		timer = null;
		timerRunning = false;
	}

	private void startTimer() {
		if (timerGoingUp) {
			starttime = System.currentTimeMillis();
			upTimer = new Timer();
			upTimer.schedule(new MyUpTimer(), 0, 500);
		} else {
			showDownTimer();
		}
		timerRunning = true;
	}

	private void showDownTimer() {
		if (timer != null)
			timer.cancel();
		timer = new CountDownTimer(availableTime * 1000, 10) {
			@Override
			public void onTick(long millisUntilFinished) {
				TvTimer.setText(Long.toString(millisUntilFinished / 1000));
			}

			@Override
			public void onFinish() {
				calculateScore();
			}
		}.start();

	}

	class MyUpTimer extends TimerTask {
		@Override
		public void run() {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					long millis = System.currentTimeMillis() - starttime;
					int seconds = (int) (millis / 1000);
					timeTaken = seconds;
					int minutes = seconds / 60;
					seconds = seconds % 60;
					TvTimer.setText(String.format("%d:%02d", minutes, seconds));
				}
			});
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
