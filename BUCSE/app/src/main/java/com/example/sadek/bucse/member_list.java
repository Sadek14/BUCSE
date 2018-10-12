package com.example.sadek.bucse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class member_list extends AppCompatActivity {

    public Button shovan_sir_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);

        shovan_sir_btn=(Button)findViewById(R.id.shovan_button);
            shovan_sir_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     //   Intent i=new Intent(getApplicationContext(),shovan_sir_details.class);
                     //   startActivity(i);
                    }
                });

    }
}
