package com.droidacid.apticalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class TnTricksNumSys extends Activity implements OnClickListener{

	
	TextView TVsquares31, TVsquares51;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tntnumsys);
		initialize();
		//string= string.replace("//n",System.getProperty("line.seperator"));
		TVsquares31.setText("Find the square of numbers from 31 to 50");
		TVsquares51.setText("Find the square of numbers from 51 to 80");
		//TVsquares31.setText("Find the square of numbers from 31 to 50");
		//TVsquares31.setText("Find the square of numbers from 31 to 50");
		TVsquares31.setOnClickListener(this) ;
		TVsquares51.setOnClickListener(this) ;
		//TVsquares31.setOnClickListener(this) ;
	}
	
	private void initialize()
	{
		TVsquares31 = (TextView) findViewById(R.id.TVsquares31);
		TVsquares51 = (TextView) findViewById(R.id.TVsquares51);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.TVsquares31:
		TVsquares31.setText("Treat these numbers as (50 - x). " + System.getProperty("line.seperator") +
				"e.g Square of 41. \n" + 
				"Step 1: Look at 41 as (50 - 9).\n" + 
				"Now suppose that the answer has 2 parts, first 2 digits and last 2 digits.\n" + 
				"Step 2:");
		break;
		
		case R.id.TVsquares51:
		TVsquares51.setText("Treat these numbers as (50 - x). " + System.getProperty("line.seperator") +
				"e.g Square of 41. " + System.getProperty("line.seperator") +
				"Step 1: Look at 41 as (50 - 9)." + System.getProperty("line.seperator") +
				"Now suppose that the answer has 2 parts, first 2 digits and last 2 digits." + System.getProperty("line.seperator") +
				"Step 2:");
		break;
		}		
	}
	
	
	
	

}
