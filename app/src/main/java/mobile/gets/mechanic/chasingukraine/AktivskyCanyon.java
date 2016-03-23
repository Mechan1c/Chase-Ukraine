package mobile.gets.mechanic.chasingukraine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AktivskyCanyon extends AppCompatActivity {

    TextView tvDesc, tvType, tvTypeVal, tvLoc, tvLocVal;
    Button bSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivsky_canyon);

        View.OnClickListener listenToToast = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                this.showToast(v);
            }

            public void showToast(View v) {
                String msg = String.valueOf(tvLocVal.getText()) ;
                Toast toast = Toast.makeText(getApplicationContext(),
                        msg ,
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        };

        tvDesc = (TextView) findViewById(R.id.tvDescription);
        bSub = (Button) findViewById(R.id.bSubmit);
        tvType =(TextView) findViewById(R.id.type);
        tvTypeVal =(TextView) findViewById(R.id.typeVal);
        tvLoc =(TextView) findViewById(R.id.location);
        tvLocVal =(TextView) findViewById(R.id.locationVal);

        bSub.setOnClickListener(listenToToast);
        tvDesc.setOnClickListener(listenToToast);
        tvType.setOnClickListener(listenToToast);
        tvTypeVal.setOnClickListener(listenToToast);
        tvLoc.setOnClickListener(listenToToast);
        tvLocVal.setOnClickListener(listenToToast);


    }

    /*Closing app on back button*/

    @Override
    public void onBackPressed()
    {
        finish();
    }
}
