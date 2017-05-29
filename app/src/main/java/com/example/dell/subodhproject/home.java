package com.example.dell.subodhproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void onPress(View V) {
        if (V.getId() == R.id.button1) {
            Toast t = Toast.makeText(this, "s1", Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
