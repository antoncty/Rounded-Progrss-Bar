package com.cti.roundedprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cti.roundedprogressbar.widget.CustomProgressBar;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        CustomProgressBar cpb = (CustomProgressBar) findViewById(R.id.CustomProgressBar);
        cpb.setProgress(75);
        cpb.setBigText("Big text");
    }
}
