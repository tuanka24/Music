package com.tuki.android_music;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.tuki.android_music.R;
import com.tuki.android_music.adapter.MusicPageAdapter;
import com.tuki.android_music.adapter.MusicPageAdapter;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerMain;
    private NavigationView navMain;
    private ViewPager vpMusic;
    private MusicPageAdapter adapter;
    private TabLayout tabMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

        drawerMain = findViewById(R.id.drawer);
        navMain = findViewById(R.id.nav_main);
        vpMusic= findViewById(R.id.vp_music);

        adapter = new MusicPageAdapter(getSupportFragmentManager());
        vpMusic.setAdapter(adapter);
        navMain.setNavigationItemSelectedListener(this);
        tabMain =findViewById(R.id.tab_main);
        tabMain.setupWithViewPager(vpMusic);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {  // gọi trên mỗi menu đc click
        if (item.getItemId() == R.id.home){
            if (drawerMain.isDrawerOpen(GravityCompat.START)) {
                drawerMain.closeDrawer(GravityCompat.START);

            }else {
                drawerMain.openDrawer(GravityCompat.START);
            }

            return  true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_baihat:
                Toast.makeText(this, "artist",Toast.LENGTH_LONG).show();

                break;

            case R.id.menu_abum:
                Toast.makeText(this, "song",Toast.LENGTH_LONG).show();

                break;
            case R.id.menu_nghesi:
                Toast.makeText(this, "album",Toast.LENGTH_LONG).show();

                break;
            case R.id.menu_other:
                Toast.makeText(this, "album",Toast.LENGTH_LONG).show();

                break;

        }

        return false;
    }
}