package com.droidacid.apticalc.tipsandtricks;

import com.droidacid.apticalc.R;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class TipsAndTricks extends ListActivity {
	String tag = "TipsAndTricks Class";
	
	/*
	 * YOU HAVE TO FIX THESE ARRAY YOURSELF BECAUSE I DON'T
	 * SEE THE LOGIC BETWEEN THE FILES AND THE ARRAY Tips[]
	 */
	String Tips[] = { 
			"Maths Magic", "Addition", "Subtraction", 
			"Multiplication", "Division", "Multiply By 11", 
			"Multiply By 12", "Division By 9", "Square Of 2 Digits"
	};
	String files[] = { 
			"tips/TnT_CalcMagic.html", "tips/TnT_Addition.html", "tips/TnT_Subtraction.html", 
			"tips/TnT_Multiplication.html", "tips/TnT_PrimeNumbers.html", "tips/TnT_BeautyOfMaths.html", 
			"tips/TnT_DayOfTheDay.html", "tips/TnT_SpecialNumbers.html", "tips/TnT_Tricks.html"
	};

	private TipsListAdapter mAdapter;		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tat_list_layout);
	
	if ( mAdapter == null){
		mAdapter = new TipsListAdapter(this);
		setListAdapter(mAdapter);		
	}
	mAdapter.setData(Tips);
	
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);	    
	    showText(files[position]);
	}
	
	public void showText(String filename){
		Intent showIt = new Intent(this, TipsAndTricksShowTextView.class);
		Bundle toShow = new Bundle();
		toShow.putString("tat_show_file", filename);
		showIt.putExtras(toShow);
		startActivity(showIt);
	}
}