package cms.co.in.transport;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private ArrayList<String> imageview = new ArrayList<>();
    private ArrayList<String> tvview = new ArrayList<>();
    private RecyclerView recyclerView,recyclerviewrc,recyclerviewdl;
    private RecyclerView.LayoutManager layoutManager,layoutManagerrc,layoutManagerdl;
    private List<String> list;
    private List<String> listrc;
    private List<String> listdl;
    private Recyclerviewadapter adapter;
    private Recyclerviewrcadapter rcadapter;
    private Recyclerviewdladapter dladapter;
    TextView signintv;
    View hview;
    ImageView img_background;
    RelativeLayout tenrules;
    EditText ed_searchview;
    Menu nav_Menu;
    Vibrator vibe;


    private static final int SECOND_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        hview = navigationView.getHeaderView(0);

        navigationView.setNavigationItemSelectedListener(this);
         nav_Menu = navigationView.getMenu();

        img_background = findViewById(R.id.mainbackground);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);




        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);

        img_background.startAnimation(animation);


        signintv =  hview.findViewById(R.id.tvsignin);

        signintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Signinactivity.class);
                startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
            }
        });

      tenrules = findViewById(R.id.wheelid);

      tenrules.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(MainActivity.this,IntroActivity.class);
              startActivity(i);

          }
      });


      ed_searchview = findViewById(R.id.ed_search);

      ed_searchview.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(MainActivity.this,Searchbardetails.class);
              startActivity(i);
          }
      });



        /*---------Recyclerview-------*/
        recyclerView = findViewById(R.id.recyclerviewid);
        layoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Recyclerviewadapter(getList(),this);
        recyclerView.setAdapter(adapter);

        /*RC Recyclerview*/

        recyclerviewrc = findViewById(R.id.recyclerviewidrc);
        layoutManagerrc= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerviewrc.setLayoutManager(layoutManagerrc);
        rcadapter = new Recyclerviewrcadapter(getlist2(),this);
        recyclerviewrc.setAdapter(rcadapter);

        /*DL Recyclerview*/

        recyclerviewdl = findViewById(R.id.recyclerviewiddl);
        layoutManagerdl= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerviewdl.setLayoutManager(layoutManagerdl);
        dladapter = new Recyclerviewdladapter(getlist3(),this);
        recyclerviewdl.setAdapter(dladapter);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

      //  MenuItem rcdashboard  = menu.findItem(R.id.rcdashboard);
       // rcdashboard.setVisible(true);

        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SECOND_ACTIVITY_REQUEST_CODE)
        {
          if(resultCode ==RESULT_OK){
              String name = "test";
               name = data.getStringExtra("KeyName");
               signintv.setText(name);
               nav_Menu.findItem(R.id.rcdashboard).setVisible(true);
               nav_Menu.findItem(R.id.dldashboard).setVisible(true);
               nav_Menu.findItem(R.id.MISReports).setVisible(true);
               nav_Menu.findItem(R.id.logout).setVisible(true);

          }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this,
                    "Your Message", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_camera) {

            /*Toast.makeText(MainActivity.this,
                    "Clicked", Toast.LENGTH_SHORT).show();*/
            Intent i = new Intent(this,Searchbardetails.class);
            startActivity(i);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

            /*Toast.makeText(MainActivity.this,
                    "Clicked", Toast.LENGTH_SHORT).show();*/

            Intent i = new Intent(this,Searchbardetails.class);
            startActivity(i);

        } else if (id == R.id.nav_slideshow) {
           /* Toast.makeText(MainActivity.this,
                    "Clicked", Toast.LENGTH_SHORT).show();*/

            Intent i = new Intent(this,Termsandcondition.class);
            startActivity(i);

        } else if (id == R.id.about) {
            /*Toast.makeText(MainActivity.this,
                    "Clicked", Toast.LENGTH_SHORT).show();
*/
            Intent i = new Intent(this,About.class);
            startActivity(i);

        } else if (id == R.id.action_ambulance) {

            Toast.makeText(MainActivity.this,
                    "Your Message", Toast.LENGTH_SHORT).show();

        }else if (id == R.id.logout) {
            openDialog();

           /* Toast.makeText(MainActivity.this,
                    "Your Message", Toast.LENGTH_SHORT).show();*/


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private ArrayList<Models> getList(){

        ArrayList<Models> list = new ArrayList<>();
        list.add(new Models("Traffic Status",R.drawable.ddtraffic));
        list.add(new Models("Citizen Report",R.drawable.report));
        list.add(new Models("Nearest RTO",R.drawable.rto));



        return list;
    }

    private ArrayList<Modelsrc> getlist2(){

        ArrayList<Modelsrc> listrc = new ArrayList<>();
        listrc.add(new Modelsrc("Temporary Reg",R.drawable.id_card__1_));
        listrc.add(new Modelsrc("Permanent Reg",R.drawable.globe));
        listrc.add(new Modelsrc("Renewal Of Reg",R.drawable.id_card__2_));
        listrc.add(new Modelsrc("Duplicate Rc",R.drawable.id_card__3_));

        return listrc;
    }

    private ArrayList<Modelsdl> getlist3(){

        ArrayList<Modelsdl> listdl = new ArrayList<>();
        listdl.add(new Modelsdl("Learner's DL",R.drawable.id_card__3_));
        listdl.add(new Modelsdl("Permanent DL",R.drawable.id_card__5_));
        listdl.add(new Modelsdl("Renewal Of DL",R.drawable.id_card__2_));
        listdl.add(new Modelsdl("Duplicate DL",R.drawable.id_card__3_));

        return listdl;
    }

    public void openDialog() {
         final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setContentView(R.layout.dialog_demo);
        dialog.setTitle(R.string.dialog_title);
        dialog.show();

        Button dialog_ok = (Button) dialog.findViewById(R.id.dialog_ok);
        Button dialog_cancel = (Button) dialog.findViewById(R.id.dialog_cancel);
        dialog_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signintv.setText("Sign In");
                nav_Menu.findItem(R.id.rcdashboard).setVisible(false);
                nav_Menu.findItem(R.id.dldashboard).setVisible(false);
                nav_Menu.findItem(R.id.MISReports).setVisible(false);
                nav_Menu.findItem(R.id.logout).setVisible(false);
                dialog.dismiss();
            }
        });
        dialog_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
               /* Toast.makeText(MainActivity.this,
                        "Your Message", Toast.LENGTH_SHORT).show();*/
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    }


