package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ShivamD on 5/18/13.
 */
public class AptiLcmHcf extends Activity implements View.OnClickListener {

    Button blcm, bhcf;
    EditText EtNumber1, EtNumber2; // EtNumber3;
	TextView TvResult;
	int max, min, lcm, hcf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aptilcmhcf);
        
    }
    
    protected void initialize() {
		
		EtNumber1 = (EditText) findViewById(R.id.Et_apti_Num1);
		EtNumber2 = (EditText) findViewById(R.id.Et_apti_Num2);
		// EtNumber3 = (EditText) findViewById(R.id.Et_apti_Hcf3);
		TvResult = (TextView) findViewById(R.id.tv_apti_LcmResult);
		blcm = (Button) findViewById(R.id.b_apti_Lcm);
        bhcf = (Button) findViewById(R.id.b_apti_Hcf);
        blcm.setOnClickListener(this);
        bhcf.setOnClickListener(this);
		values();
	}
    private void values() {
		if (EtNumber1.getText().toString().equals(""))
			EtNumber1.setText("0");
		if (EtNumber2.getText().toString().equals(""))
			EtNumber2.setText("0");
		// if (num3.getText().toString().equals("")) num3.setText("0");

		int numb1 = Integer.parseInt(EtNumber1.getText().toString());
		int numb2 = Integer.parseInt(EtNumber2.getText().toString());
		// Double numb3 = Double.parseDouble(num3.getText().toString());
		calcHCF(numb1, numb2);
		calcLCM(numb1, numb2, hcf);
	}

	

	private int calcLCM(int num1, int num2, int hcf) {
		return (num1 * num2)/ hcf;
		}
		
	

	private int calcHCF(int num1, int num2) {
		if(num1==0)
			return num2;
		else {
			return calcHCF(num2%num1, num1);
		}
		//hcf = calcHCF(num1, num2);
	}


    @Override
    public void onClick(View view) {
    	
    	
        
        }

    }

