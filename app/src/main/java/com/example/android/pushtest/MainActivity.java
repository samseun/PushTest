package com.example.android.pushtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ThisBetterWork(){
        int testing = 12;
        int yo = 12 + 12;
    }

    public void run(){
        Test runner = new Test();
        Test runnee = new Test();
        Test runnet = new Test();
        runnet.age = 23;
         runnee.hard = 1;
         runner.tester();

    }

}

