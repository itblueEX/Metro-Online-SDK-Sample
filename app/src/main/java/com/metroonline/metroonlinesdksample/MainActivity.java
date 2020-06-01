package com.metroonline.metroonlinesdksample;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.metroonline.metroonlinesdk.Common.SplashScreen;
import com.metroonline.metroonlinesdk.Common.Vendor_Details;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email,phone,firstname,lastname,vendorcode;
    Button startapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        vendorcode = findViewById(R.id.vendor);
        startapp = findViewById(R.id.startapp);

        startapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vendor_Details vendor_details = new Vendor_Details();
                vendor_details.email = email.getText().toString();
                vendor_details.phone = phone.getText().toString();
                vendor_details.firstname = firstname.getText().toString();
                vendor_details.lastname = lastname.getText().toString();
                vendor_details.vendorcode = vendorcode.getText().toString();
                Intent i = new Intent(MainActivity.this, SplashScreen.class);
                i.putExtra("vendor_details",vendor_details);
                startActivityForResult(i, 600);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 600){
            if (resultCode == RESULT_OK) {
                Intent orderintent = new Intent(MainActivity.this,OrderDetails.class);
                orderintent.putExtra("order_details",data.getStringExtra("details"));
                startActivity(orderintent);
            }
        }
    }


}
