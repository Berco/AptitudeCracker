package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import com.droidacid.apticalc.R.id;
import com.droidacid.apticalc.R.layout;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ShivamD on 5/18/13.
 */
public class AptiHcf extends Activity implements View.OnClickListener {

    Button calculate;
    EditText EtNumber1, EtNumber2, EtNumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aptilcmhcf);
        initialize();
    }
    protected void initialize(){
        calculate = (Button) findViewById(R.id.bHcf);
        EtNumber1 = (EditText) findViewById(R.id.EtHcf1);
        EtNumber2 = (EditText) findViewById(R.id.EtHcf2);
        EtNumber3 = (EditText) findViewById(R.id.EtHcf3);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*if (v.getId() == R.id.bcalcWD){
            int selectedRB = RGselect.getCheckedRadioButtonId();

            if (num1.getText().toString().equals("")) num1.setText("0");
            if (num2.getText().toString().equals("")) num2.setText("0");
            if (num3.getText().toString().equals("")) num3.setText("0");

            Double numb1 = Double.parseDouble(num1.getText().toString());
            Double numb2 = Double.parseDouble(num2.getText().toString());
            Double numb3 = Double.parseDouble(num3.getText().toString());


            switch (selectedRB){
                case R.id.rbtwoperson:
                    TVoutput.setText("Time taken = " + Double.toString(100 / (100/numb1 + 100/numb2)) + " days");
                    Log.d(tag, "I am running 1st - rbtwoperson" + numb1 + numb2);
                    break;
                case R.id.rbthreeperson:
                    TVoutput.setText("Time taken = " + Double.toString(100 / (100/numb1 + 100/numb2 + 100/numb3)) + " days");
                    break;
            }
        }*/
    }
}
