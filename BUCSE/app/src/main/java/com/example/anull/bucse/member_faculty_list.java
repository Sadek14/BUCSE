package com.example.anull.bucse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class member_faculty_list extends AppCompatActivity {
    public Button Skp_btn , Moh_btn  , Rita_btn , amena_btn , mohibul_btn , yousuf_btn , bakaul_btn
             ,raju_btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_faculty_list);
        getSupportActionBar().setTitle("Faculty Member List");
        //join btn with xml id
        Skp_btn= findViewById(R.id.shovan_button);
        Moh_btn=findViewById(R.id.mozammel_button);
        Rita_btn=findViewById(R.id.rita_button) ;
        amena_btn=findViewById(R.id.amena_button) ;
        mohibul_btn=findViewById(R.id.mohibullah_button);
        yousuf_btn=findViewById(R.id.yousuf_button);
        bakaul_btn=findViewById(R.id.masum_button);
        raju_btn= findViewById( R.id.mahmudul_button);






            //listeing to the buttons

        Skp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Shovan_details.class);
                startActivity(i);
            }
        });

        Moh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Mozammel_details.class);
                startActivity(i);
            }
        });
        mohibul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , mohibul.class);
                startActivity(i);
            }
        });
        raju_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Raju.class);
                startActivity(i);
            }
        });
        yousuf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Yusuf.class);
                startActivity(i);
            }
        });
        bakaul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Masum.class);
                startActivity(i);
            }
        });
        Rita_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Rita.class);
                startActivity(i);
            }
        });
        amena_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext() , Amena.class);
                startActivity(i);
            }
        });












    }
}
