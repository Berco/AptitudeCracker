package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AptiNumSys extends Activity implements OnClickListener{
    Button add, subtract, multiply, divide, mod;
    TextView  output;
    EditText number1, number2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aptinumsys);

        // Reference TextViews and Buttons
        number1 = (EditText) findViewById(R.id.Et_apti_number1);
        number2 = (EditText) findViewById(R.id.Et_apti_number2);
        output = (TextView) findViewById(R.id.Tv_apti_output);
        add = (Button) findViewById(R.id.b_apti_add);
        subtract = (Button) findViewById(R.id.b_apti_sub);
        multiply = (Button) findViewById(R.id.b_apti_mul);
        divide = (Button) findViewById(R.id.b_apti_div);
        mod = (Button) findViewById(R.id.b_apti_mod);

        // Set listeners for when buttons are pressed
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        mod.setOnClickListener(this);

    }

    /**
     * Switch statement to decide which button was pressed
     */
    public void onClick(View v) {
        // Get values from top two TextViews
        double numberone = Double.parseDouble(number1.getText().toString());
        double numbertwo = Double.parseDouble(number2.getText().toString());
        // Initialize output
        double outputValue = 0;

        // Perform relevant operations
        switch(v.getId()){
        case R.id.b_apti_add:
            outputValue = numberone + numbertwo;
            break;
        case R.id.b_apti_sub:
            outputValue = numberone - numbertwo;
            break;
        case R.id.b_apti_mul:
            outputValue = numberone * numbertwo;
            break;
        case R.id.b_apti_div:
            outputValue = numberone / numbertwo;
            break;
        case R.id.b_apti_mod:
            outputValue = numberone % numbertwo;
            break;
        }
        // Add result to Running total stored in output TextView
    	String result = "Answer is : "+outputValue;
    	TextView tvresult = (TextView) findViewById(R.id.Tv_apti_output);
    	tvresult.setText(result);

    }

}
