/*
 * This package name is autogenerated by Neonto Studio
 * when using 'Open in Android Studio'.
 * 
 * To change the package name, use 'Export' instead.
 */

package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.neonto.exportedByUser_s2461812465168012.MyApp.R;

public class MoreActivity extends android.support.v7.app.ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_more);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new MoreFragment())
                    .commit();
        }

        setTitle(getString(R.string.more_title));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
