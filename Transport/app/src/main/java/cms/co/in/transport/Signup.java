package cms.co.in.transport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    TextView tv_car2,tv_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        tv_car2 = findViewById(R.id.car_img2);
        tv_signup = findViewById(R.id.signup);

        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Signup.this,Donesuccesfully.class);
                startActivity(i);

            }
        });

        Animation animation = AnimationUtils.loadAnimation(Signup.this,R.anim.fadein);

        tv_car2.startAnimation(animation);


    }
}
