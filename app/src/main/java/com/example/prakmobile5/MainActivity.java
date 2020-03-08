package com.example.prakmobile5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = new HomeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.btn_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadfragments(selectedFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_home:
            selectedFragment = new HomeFragment();

            break;
            case R.id.menu_profile:
            selectedFragment = new ProfileFragment();

            break;

        }

        return loadfragments(selectedFragment);
    }

    private boolean loadfragments(Fragment selectedFragment) {
        if (selectedFragment!=null){
            getSupportFragmentManager()
                    .beginTransaction().replace(R.id.activitymain_cont,selectedFragment).commit();
            return true;
        }
        return false;
    }
}
