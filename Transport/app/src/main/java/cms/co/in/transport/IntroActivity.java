package cms.co.in.transport;

import android.os.Bundle;
import android.support.annotation.Nullable;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.SlideFragmentBuilder;

public class IntroActivity extends MaterialIntroActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.colorpurple)
                        .buttonsColor(R.color.colorPrimary)
                        .image(R.drawable.students)
                        .title("STOP OR SLOW DOWN")
                        .description("Allow pedestrians to cross first at uncontrolled zebra crossings. They have the right of way.")
                        .build());

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.colorviolet)
                        .buttonsColor(R.color.colorPrimary)
                        .image(R.drawable.car__2_)
                        .title("BUCKLE UP")
                        .description("So that your family and you are safe in the car.(Section 138(3)) Seat Belts reduce changes of death of a car occupant in accident by 60%.")
                        .build());



        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colororange)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.speed_limit)
                .title("OBEY SPEED LIMITS")
                .description("For Your safety and that of others.(Section 112) In residential areas and market places that idealspeed is 20kmph and the limit is 30kmph ")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.coloryellow)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.car__3_)
                .title("KEEP VEHICLE FIT")
                .description("TO prevent break down and accident on road.(Section 190)")
                .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorgreen)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.mobile_phone)
                .title("NEVER USE MOBILE WHILE DRING")
                .description("To avoid distractions that lead to accident.(Section 184).")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorbrown)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.racing_helmet)
                .title("WEAR HELMET")
                .description("To protect your head while riding a two wheeler.(Section 129) A Good quality helmet reduces the chances to severe head injury by over 70%.")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorred)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.car_collision)
                .title("NEVER DRIVE DANGEROUSLY")
                .description("To ensure your own Safety and that of other road users.(Section 184)")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.coloryellow)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.school_bus)
                .title("BE COURTEOUS")
                .description("Share the road with all and be considerable.Never rage on the road.")
                .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colornavyblue)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.no_alcohol)
                .title("NEVER MIX DRINKING AND DRIVING")
                .description("Be responsible...Don't drink Drive.(Section 185)")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorblue)
                .buttonsColor(R.color.colorPrimary)
                .image(R.drawable.carsharing)
                .title("OBEY TRAFFIC RILES AND SIGNS")
                .description("To prevent road accident (Sections 119)")
                .build());



    }

}
