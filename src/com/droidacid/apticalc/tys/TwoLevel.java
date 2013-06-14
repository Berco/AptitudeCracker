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
		
		
		

		BAdd = (Button) findViewById(R.id.BAddition);
		BSubtract = (Button) findViewById(R.id.BSubtraction);
		BMultiply = (Button) findViewById(R.id.BMultiplication);
		BDivide = (Button) findViewById(R.id.BDivision);
		BAll = (Button) findViewById(R.id.BAll);

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

		case R.id.BAddition:
			mQuestions = ADDITION;
			Counter.putExtras(QuestionType);
			break;
		case R.id.BSubtraction:
			mQuestions = SUBTRACT;
			Counter.putExtras(QuestionType);
			break;
		case R.id.BMultiplication:
			mQuestions = MULTIPLY;
			Counter.putExtras(QuestionType);
			break;
		case R.id.BDivision:
			mQuestions = DIVIDE;
			Counter.putExtras(QuestionType);
			break;
		case R.id.BAll:
			mQuestions = ALL;
			Counter.putExtras(QuestionType);
			break;
		}
		QuestionType.putInt("questionType", mQuestions);
		Counter.putExtras(QuestionType);
		startActivity(Counter);

	}

}
