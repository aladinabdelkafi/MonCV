package com.example.projetcv;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
   static boolean isDark = false;

    FloatingActionButton fabSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fabSwitcher = findViewById(R.id.fab_switcher);
        final RecyclerView stageRecyclerview =findViewById(R.id.news_rv);
        final RelativeLayout parcourlayout=findViewById(R.id.Relativ_parc);
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        final NavigationView navigationView = findViewById(R.id.nav_view);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_about, R.id.nav_stage, R.id.nav_event,R.id.nav_club,R.id.nav_competance,R.id.nav_langue,R.id.nav_parcours,R.id.nav_formation,R.id.nav_certif)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



        isDark = getThemeStatePref();
        if(isDark) {
            // dark theme is on
            drawer.setBackgroundColor(getResources().getColor(R.color.black));
            navigationView.setBackgroundColor(getResources().getColor(R.color.black_1));

        }
        else
        {
            // light theme is on
            drawer.setBackgroundColor(getResources().getColor(R.color.white));
            navigationView.setBackgroundColor(getResources().getColor(R.color.white));
        }

        fabSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isDark = !isDark ;
                if (isDark) {
                    drawer.setBackgroundColor(getResources().getColor(R.color.black));
                    navigationView.setBackgroundColor(getResources().getColor(R.color.black_1));
                }
                else {
                    drawer.setBackgroundColor(getResources().getColor(R.color.white));
                    navigationView.setBackgroundColor(getResources().getColor(R.color.white));
                }

                saveThemeStatePref(isDark);


            }
        });






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private void saveThemeStatePref(boolean isDark) {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isDark",isDark);
        editor.commit();
    }

    private boolean getThemeStatePref () {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        boolean isDark = pref.getBoolean("isDark",false) ;
        return isDark;

    }
}
