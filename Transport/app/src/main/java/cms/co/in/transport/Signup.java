package cms.co.in.transport;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    TextView tv_car2,tv_signup;
     EditText email2,pass2,pass3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email2 = findViewById(R.id.email2);
        pass2 = findViewById(R.id.pass2);
        pass3 = findViewById(R.id.pass3);



        tv_car2 = findViewById(R.id.car_img2);
        tv_signup = findViewById(R.id.signup);

        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = email2.getText().toString();
                String strPassword = pass2.getText().toString();
                String strPassword1 = pass3.getText().toString();
                SharedPreferences sp=getSharedPreferences("Login", 0);
                SharedPreferences.Editor Ed=sp.edit();
                Log.d("dfdd",""+email2.getText().toString());
                Log.d("dfdd",""+pass2.getText().toString());
                Ed.putString("Unm",email2.getText().toString());
                Ed.putString("Psw",pass2.getText().toString());
                Ed.commit();


                if(TextUtils.isEmpty(strUserName)) {
                    email2.setError("Enter UserName");
                    return;
                }
                if(TextUtils.isEmpty(strPassword)) {
                    pass2.setError("Enter Password");
                    return;
                }
                if(!strPassword.equals(strPassword1)) {
                    pass3.setError("Enter Same Password");
                    return;
                }


                Intent i = new Intent(Signup.this,Donesuccesfully.class);
                startActivity(i);

            }
        });

        Animation animation = AnimationUtils.loadAnimation(Signup.this,R.anim.fadein);

        tv_car2.startAnimation(animation);


    }
}
