package cms.co.in.transport;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HpEndrosement extends AppCompatActivity {
    ImageView logo;
    TextView textid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp_endrosement);
        logo = findViewById(R.id.logo1);
        textid2 = findViewById(R.id.textid2);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HpEndrosement.this,MainActivity.class);
                startActivity(intent);
            }
        });
        String text2 = "Attested Copy of PAN card of Form 60 and Form 61";
        SpannableStringBuilder ssBuilder1 = new SpannableStringBuilder(text2);
        ssBuilder1.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text2.indexOf("Form 60"),
                text2.indexOf("Form 60") + String.valueOf("Form 60").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder1.setSpan(
                new StyleSpan(Typeface.BOLD),
                text2.indexOf("Form 60"),
                text2.indexOf("Form 60") + String.valueOf("Form 60").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder1.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text2.indexOf("Form 61"),
                text2.indexOf("Form 61") + String.valueOf("Form 61").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder1.setSpan(
                new StyleSpan(Typeface.BOLD),
                text2.indexOf("Form 61"),
                text2.indexOf("Form 61") + String.valueOf("Form 61").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        textid2.setText(ssBuilder1);

    }
}
