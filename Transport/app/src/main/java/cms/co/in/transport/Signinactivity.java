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
import android.widget.Toast;

public class Signinactivity extends AppCompatActivity {
    TextView tv_car,signin,Create;
     EditText et_uName,et_pswd;
    SharedPreferences sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinactivity);

        tv_car = findViewById(R.id.car_img);
        signin = findViewById(R.id.signin);
        et_uName = findViewById(R.id.et_uName);
        et_pswd = findViewById(R.id.et_pswd);
        Create = findViewById(R.id.Create);


         sp1=this.getSharedPreferences("Login",0);

      /*  final String unm=sp1.getString("Unm", null);
        String pass = sp1.getString("Psw", null);

       final String Uname =  et_uName.getText().toString();*/


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = et_uName.getText().toString();
                String strPassword = et_pswd.getText().toString();

                if (TextUtils.isEmpty(strUserName)) {
                    et_uName.setError("Enter UserName");
                    return;
                }
                if (TextUtils.isEmpty(strPassword)) {
                    et_pswd.setError("Enter Password");
                    return;
                }
                String unm = sp1.getString("Unm", null);
                String pass = sp1.getString("Psw", null);
                String unm1 = et_uName.getText().toString();
                String pass1 = et_pswd.getText().toString();
                Log.d("dfd1", "" + unm);
                Log.d("dfd2", "" + pass);
                Log.d("dfd3", "" + unm1);
                Log.d("dfd4", "" + et_pswd.getText().toString());
                if (unm == null && pass == null) {
                    Log.d("sdsads", "" + unm);
                    Toast.makeText(getApplicationContext(), "Your are not registered user,Registered First", Toast.LENGTH_LONG).show();
                    et_uName.setText("");
                    et_pswd.setText("");
                } else {

                if(unm.equals(unm1)&&pass.equals(pass1))
                {
                    Log.d("ddede","ded");
                    Constant.SIGNIN = true;
                    Intent intent = new Intent();
                    intent.putExtra("KeyName", et_uName.getText().toString());
                    setResult(RESULT_OK, intent);
                    et_uName.setText("");
                    et_pswd.setText("");
                    finish();


                }
                else{
                    Toast.makeText(getApplicationContext(),"Please enter valid Username and Password",Toast.LENGTH_LONG).show();
                    et_uName.setText("");
                    et_pswd.setText("");
                }


                }
            }
        });
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signinactivity.this,Signup.class);
                startActivity(intent);

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
