package mobile.gets.mechanic.chasingukraine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AktivskyCanyon extends AppCompatActivity implements View.OnClickListener {

    TextView tvDesc, tvType, tvTypeVal, tvLoc, tvLocVal;
    Button bSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivsky_canyon);

        tvDesc = (TextView) findViewById(R.id.tvDescription);
        bSub = (Button) findViewById(R.id.bSubmit);
        tvType = (TextView) findViewById(R.id.type);
        tvTypeVal = (TextView) findViewById(R.id.typeVal);
        tvLoc = (TextView) findViewById(R.id.location);
        tvLocVal = (TextView) findViewById(R.id.locationVal);
        bSub.setOnClickListener(this);
        tvDesc.setOnClickListener(this);
        tvType.setOnClickListener(this);
        tvTypeVal.setOnClickListener(this);
        tvLoc.setOnClickListener(this);
        tvLocVal.setOnClickListener(this);
    }

    /*Closing app on back button*/

    @Override
    public void onBackPressed() {
        finish();
    }

        @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),
                v.getClass().getSimpleName(),
                Toast.LENGTH_SHORT).show();
    }
}
