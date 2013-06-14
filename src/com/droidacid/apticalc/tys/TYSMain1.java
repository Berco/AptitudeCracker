package com.droidacid.apticalc.tys;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.R.id;
import com.droidacid.apticalc.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TYSMain1 extends Activity implements OnClickListener {

	final static String tag = "TYSMain1 Activity";
	Button BAdd, BSubtract, BMultiply, BDivide, BAll;
	
	private static final int EASY = 0;
	private static final int MEDIUM = 1;
	private static final int HARD = 2;
	private static final int ADDITION = 0;
	private static final int SUBSTRACT = 1;
	private static final int MULTIPLY = 2;
	private static final int DIVIDE = 3;
	private static final int ALL = 4;
	
	private int mDifficultyType;
	private int mQuestionType = ADDITION;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tysmain1);
		
		
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
		
		Bundle difficultyType = getIntent().getExtras();
		difficultyType.putInt("questionType", mQuestionType);
		
		Intent Counter = new Intent(this, TYS_Counter.class);
		
				
		switch (v.getId()) {

		case R.id.BAddition:
			Counter.putExtras(difficultyType);
			break;
		case R.id.BSubtraction:
			Counter.putExtras(difficultyType);
			break;
		case R.id.BMultiplication:
			Counter.putExtras(difficultyType);
			break;
		case R.id.BDivision:
			Counter.putExtras(difficultyType);
			break;
		case R.id.BAll:
			Counter.putExtras(difficultyType);
			break;
		}
		startActivity(Counter);

	}

}
