package com.droidacid.apticalc.more;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.droidacid.apticalc.R;

public class More extends Activity implements OnClickListener{

	Button bUpgrade, bAbout, bReportBug, bReview, bSuggestions, bLikeUs;
	String urlSuggest = "http://www.droidacid.com/suggestions/";
	String likeUs = "http://www.facebook.com/AptitudeCrackerApp/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.more);
		initialize();
	}

	private void initialize() {
		
		bUpgrade = (Button) findViewById(R.id.b_more_Upgrade);
		bAbout = (Button) findViewById(R.id.b_more_About);
		bReportBug = (Button) findViewById(R.id.b_more_Report);
		bReview = (Button) findViewById(R.id.b_more_Review);
		bSuggestions = (Button) findViewById(R.id.b_more_Suggestions);
		bLikeUs = (Button) findViewById(R.id.b_more_LikeUs);

		bUpgrade.setOnClickListener(this);
		bAbout.setOnClickListener(this);
		bReportBug.setOnClickListener(this);
		bReview.setOnClickListener(this);
		bSuggestions.setOnClickListener(this);
		bLikeUs.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.b_more_Upgrade:
			Intent upgrade = new Intent(this, Upgrade.class);
			startActivity(upgrade);
		break;
		case R.id.b_more_About:
			Intent about = new Intent(this, AboutUs.class);
			startActivity(about);
		break;
		case R.id.b_more_Report:
			Intent report = new Intent(this, Report.class);
			startActivity(report);
		break;
		case R.id.b_more_Review:
			Intent review = new Intent(this, Review.class);
			startActivity(review);
		break;
		case R.id.b_more_Suggestions:
			Intent suggestions = new Intent(android.content.Intent.ACTION_VIEW);
			suggestions.setData(Uri.parse(urlSuggest));
			startActivity(suggestions);
		break;
		case R.id.b_more_LikeUs:
			Intent likeus = new Intent(android.content.Intent.ACTION_VIEW);
			likeus.setData(Uri.parse(likeUs));
			startActivity(likeus);
		break;
		
		}
		
	}

}
