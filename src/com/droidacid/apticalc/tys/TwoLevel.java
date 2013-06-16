package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TwoLevel extends Activity implements OnClickListener {

	final static String tag = "TYSMain1 Activity";
	Button BAdd, BSubtract, BMultiply, BDivide, BAll;
	
	
	private static final int ADDITION = 0;
	private static final int SUBTRACT = 1;
	private static final int MULTIPLY = 2;
	private static final int DIVIDE = 3;
	private static final int ALL = 4;
	
	
	private int mQuestions, mDifficulty;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tys_two_level);
		
		
		Initialize();
	}

	private void Initialize() {
		
		
		

		BAdd = (Button) findViewById(R.id.B_tys_Addition);
		BSubtract = (Button) findViewById(R.id.B_tys_Subtraction);
		BMultiply = (Button) findViewById(R.id.B_tys_Multiplication);
		BDivide = (Button) findViewById(R.id.B_tys_Division);
		BAll = (Button) findViewById(R.id.B_tys_All);

		BAdd.setOnClickListener(this);
		BSubtract.setOnClickListener(this);
		BMultiply.setOnClickListener(this);
		BDivide.setOnClickListener(this);
		BAll.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		
		Bundle gotDifficulty = getIntent().getExtras();
		mDifficulty = gotDifficulty.getInt("difficulty", 0);
		Bundle QuestionType = new Bundle();
		QuestionType.putInt("difficulty", mDifficulty);
		
		Intent Counter = new Intent(this, ThreeCounter.class);
					
		switch (v.getId()) {

		case R.id.B_tys_Addition:
			mQuestions = ADDITION;
			Counter.putExtras(QuestionType);
			break;
		case R.id.B_tys_Subtraction:
			mQuestions = SUBTRACT;
			Counter.putExtras(QuestionType);
			break;
		case R.id.B_tys_Multiplication:
			mQuestions = MULTIPLY;
			Counter.putExtras(QuestionType);
			break;
		case R.id.B_tys_Division:
			mQuestions = DIVIDE;
			Counter.putExtras(QuestionType);
			break;
		case R.id.B_tys_All:
			mQuestions = ALL;
			Counter.putExtras(QuestionType);
			break;
		}
		QuestionType.putInt("questionType", mQuestions);
		Counter.putExtras(QuestionType);
		startActivity(Counter);

	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
