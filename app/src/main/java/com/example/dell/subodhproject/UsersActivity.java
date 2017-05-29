package com.example.dell.subodhproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by dell on 5/28/17.
 */
public class UsersActivity extends AppCompatActivity {


    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);

        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome " + nameFromIntent + " You are Redirecting to the Home Page");

        new Handler().postDelayed(new Runnable() {

			/*
             * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent accountsIntent1 = new Intent(UsersActivity.this, home.class);

                startActivity(accountsIntent1);
                /*Intent i = new Intent(UsersActivity.this, MainActivity.class);
                startActivity(i);*/

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
