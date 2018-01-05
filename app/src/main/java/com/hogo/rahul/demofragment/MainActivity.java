package com.hogo.rahul.demofragment;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hogo.rahul.demofragment.Fragment.FirstFragment;
import com.hogo.rahul.demofragment.Fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        FirstFragment login_fragment = new FirstFragment();
//                fragmentTransaction.addToBackStack("Root");
        fragmentTransaction.add(R.id.First_content_layout, login_fragment, "s");
        fragmentTransaction.commit();

//
//        android.support.v4.app.FragmentTransaction fragmentTransactionsecond = getSupportFragmentManager().beginTransaction();
//        SecondFragment fragment = new SecondFragment();
////                fragmentTransaction.addToBackStack("Root");
//        fragmentTransactionsecond.add(R.id.Second_content_layout, fragment, "s");
//        fragmentTransactionsecond.commit();

    }

}
