package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ShivamD on 5/19/13.
 */
public class AptiCompoundInt extends Activity implements View.OnClickListener{

    EditText EtPrincipal, EtRate, EtTime;
    Button bcalculate;
    TextView TvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apticompoundint);
        initialize();

    }

    private void initialize() {

        EtPrincipal = (EditText) findViewById(R.id.Et_apti_Principal);
        EtRate = (EditText) findViewById(R.id.Et_apti_Rate);
        EtTime = (EditText) findViewById(R.id.Et_apti_Time);
        bcalculate = (Button) findViewById(R.id.b_apti_CalcCompoundInt);
        TvAnswer = (TextView) findViewById(R.id.Tv_apti_Answer);
        bcalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(EtPrincipal.getText().toString().equals("")) EtPrincipal.setText("0");
        if(EtRate.getText().toString().equals("")) EtRate.setText("0");
        if(EtTime.getText().toString().equals("")) EtTime.setText("0");
        Double principal = Double.parseDouble(EtPrincipal.getText().toString());
        Double rate = Double.parseDouble(EtRate.getText().toString());
        Double time = Double.parseDouble(EtTime.getText().toString());

        String result = "Compound interest is: " + ((principal) * Math.pow((1+(rate / 100)),time));
        TvAnswer.setText(result);

    }
}
