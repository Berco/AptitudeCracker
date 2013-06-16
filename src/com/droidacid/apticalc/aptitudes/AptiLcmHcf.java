package com.droidacid.apticalc.aptitudes;

import com.droidacid.apticalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShivamD on 5/18/13.
 */
public class AptiLcmHcf extends Activity implements View.OnClickListener {

    Button lcm, hcf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aptilcmhcf);
        lcm = (Button) findViewById(R.id.b_apti_Lcm);
        hcf = (Button) findViewById(R.id.b_apti_Hcf);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.b_apti_Lcm:
            Intent LCM = new Intent(this, AptiLcm.class);
            startActivity(LCM);
            break;
            case R.id.b_apti_Hcf:
            Intent HCF = new Intent(this, AptiHcf.class);
            startActivity(HCF);
            break;
        }

    }
}
