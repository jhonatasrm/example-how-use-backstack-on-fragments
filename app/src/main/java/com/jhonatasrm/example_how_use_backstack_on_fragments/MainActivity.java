package com.jhonatasrm.example_how_use_backstack_on_fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private BottomFragment bf;
    private TopFragment tf;
    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        fm = getFragmentManager();
        ft = fm.beginTransaction();

        bf = new BottomFragment();
        tf = new TopFragment();

        ft.add( bf, "bf" );
        ft.addToBackStack( "bf" );
        ft.commit();

        ft.add( tf, "tf" );
        ft.addToBackStack( "tf" );
        ft.commit();

    }

    public void initiateTopFragment(View view) {
        ft.add( bf, "bf" );
        ft.addToBackStack( "bf" );
        ft.commit();
    }

    public void initiateBottomFragment(View view) {
        ft.add( tf, "tf" );
        ft.addToBackStack( "tf" );
        ft.commit();
    }
}
