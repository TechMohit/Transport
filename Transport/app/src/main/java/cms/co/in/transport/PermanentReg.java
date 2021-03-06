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

public class PermanentReg extends AppCompatActivity {
    ImageView logo;
    TextView textid1,textid2,textid3,textid4,textid5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permanent_reg);
        textid1 = findViewById(R.id.textid1);
        textid2 = findViewById(R.id.textid2);
        textid3 = findViewById(R.id.textid3);
        textid4 = findViewById(R.id.textid4);
        textid5 = findViewById(R.id.textid5);
        logo = findViewById(R.id.logo1);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PermanentReg.this,MainActivity.class);
                startActivity(intent);
            }
        });

        String text = "Form 34 (in case of HP endorsement)";
        String text2 = "Copy of PAN card of Form 60 and Form 61";
        String text3 = "Road worthiness certificate in Form 22 from the manufacturers (Form 22A from the Body builder)";
        String text4 = "Original sales certificate from the concerned authorities in Form 21 in case of ex-army vehicle";
        String text5 = "Form CMV Form 22A in case of Body built vehicle (EX. Goods vehicle, bus etc.)*";

        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(text);
        SpannableStringBuilder ssBuilder1 = new SpannableStringBuilder(text2);
        SpannableStringBuilder ssBuilder2 = new SpannableStringBuilder(text3);
        SpannableStringBuilder ssBuilder3 = new SpannableStringBuilder(text4);
        SpannableStringBuilder ssBuilder4 = new SpannableStringBuilder(text5);

        ssBuilder.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text.indexOf("Form 34"),
                text.indexOf("Form 34") + String.valueOf("Form 34").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder.setSpan(
                new StyleSpan(Typeface.BOLD),
                text.indexOf("Form 34"),
                text.indexOf("Form 34") + String.valueOf("Form 34").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

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

        ssBuilder2.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text3.indexOf("Form 22"),
                text3.indexOf("Form 22") + String.valueOf("Form 22").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder2.setSpan(
                new StyleSpan(Typeface.BOLD),
                text3.indexOf("Form 22"),
                text3.indexOf("Form 22") + String.valueOf("Form 22").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder2.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text3.indexOf("Form 22A"),
                text3.indexOf("Form 22A") + String.valueOf("Form 22A").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder2.setSpan(
                new StyleSpan(Typeface.BOLD),
                text3.indexOf("Form 22A"),
                text3.indexOf("Form 22A") + String.valueOf("Form 22A").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder3.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text4.indexOf("Form 21"),
                text4.indexOf("Form 21") + String.valueOf("Form 21").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder3.setSpan(
                new StyleSpan(Typeface.BOLD),
                text4.indexOf("Form 21"),
                text4.indexOf("Form 21") + String.valueOf("Form 21").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder4.setSpan(
                new ForegroundColorSpan(ContextCompat.getColor(getApplication(),R.color.headingtextcolor)),
                text5.indexOf("Form 22A"),
                text5.indexOf("Form 22A") + String.valueOf("Form 22A").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        ssBuilder4.setSpan(
                new StyleSpan(Typeface.BOLD),
                text5.indexOf("Form 22A"),
                text5.indexOf("Form 22A") + String.valueOf("Form 22A").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        textid1.setText(ssBuilder);
        textid2.setText(ssBuilder1);
        textid3.setText(ssBuilder2);
        textid4.setText(ssBuilder3);
        textid5.setText(ssBuilder4);
    }
}
