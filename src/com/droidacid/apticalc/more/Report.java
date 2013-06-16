package com.droidacid.apticalc.more;

import com.droidacid.apticalc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Report extends Activity implements OnClickListener {

	EditText EtName, EtSubject, EtLocation, EtBody;
	String Name, Subject, Location, Body, Version;
	Button bSendMail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.more_report);
		initialize();
	}

	private void initialize() {
		EtName = (EditText) findViewById(R.id.Et_more_Name);
		EtSubject = (EditText) findViewById(R.id.Et_more_Subject);
		EtLocation = (EditText) findViewById(R.id.Et_more_Location);
		EtBody = (EditText) findViewById(R.id.Et_more_Body);
		
		bSendMail = (Button) findViewById(R.id.b_more_SendMail);
		
		bSendMail.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		emailValues();
		String[] myEmail = {"makewaysforshivam@gmail.com"};
		String message = "Hello Shivam, \n\n"
				+ Body + "\n\n"
				+ Name + '\n'
				+ Location + "\n\n"
				+ Version;
		
		Intent emailSend = new Intent(android.content.Intent.ACTION_SEND);
		emailSend.putExtra(android.content.Intent.EXTRA_EMAIL, myEmail);
		emailSend.putExtra(android.content.Intent.EXTRA_SUBJECT, Subject);
		emailSend.setType("plain/text");
		emailSend.putExtra(android.content.Intent.EXTRA_TEXT, message);
		try {
		    startActivity(Intent.createChooser(emailSend, "Send mail..."));
		} catch (android.content.ActivityNotFoundException ex) {
		    Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
		}

	}

	private void emailValues() {
		
		Name = EtName.getText().toString();
		Subject = EtSubject.getText().toString();
		Location = EtLocation.getText().toString();
		Body = EtBody.getText().toString();
		Version = getResources().getString(0x7f070093).toString();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
