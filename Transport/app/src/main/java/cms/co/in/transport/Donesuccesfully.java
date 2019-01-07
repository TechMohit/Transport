package cms.co.in.transport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Donesuccesfully extends AppCompatActivity {

    ImageView imgdone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donesuccesfully);

        imgdone = findViewById(R.id.checked);

        Animation animation = AnimationUtils.loadAnimation(Donesuccesfully.this,R.anim.rotate);

        imgdone.startAnimation(animation);

    }
}
