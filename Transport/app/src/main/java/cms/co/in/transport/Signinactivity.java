package cms.co.in.transport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class Signinactivity extends AppCompatActivity {
    TextView tv_car,signin;
     EditText et_uName,et_pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinactivity);

        tv_car = findViewById(R.id.car_img);
        signin = findViewById(R.id.signin);
        et_uName = findViewById(R.id.et_uName);
        et_pswd = findViewById(R.id.et_pswd);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("KeyName", et_uName.getText().toString());
                setResult(RESULT_OK, intent);
                finish();

            }
        });



        Animation animation = AnimationUtils.loadAnimation(Signinactivity.this,R.anim.lefttoright);

        tv_car.startAnimation(animation);

      /*  tv_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Signinactivity.this,Donesuccesfully.class);
                startActivity(i);

            }
        });*/




    }
}
