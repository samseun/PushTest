package com.example.android.pushtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void run(){
        Test runner = new Test();
        Test runnee = new Test();
        Test runnet = new Test();
        runnet.rougue();
         runnee.hard = 1;
         runner.tester();

    }

}

