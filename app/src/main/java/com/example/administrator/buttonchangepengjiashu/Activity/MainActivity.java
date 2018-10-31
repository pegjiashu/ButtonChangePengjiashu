package com.example.administrator.buttonchangepengjiashu.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.example.administrator.buttonchangepengjiashu.R;
//import android.app.FragmentTransaction;


public class MainActivity extends BaseActivity {
    private NavigationFragment navigationFragment;
    protected  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationFragment = new NavigationFragment();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_frame, navigationFragment).commit();

    }
}
