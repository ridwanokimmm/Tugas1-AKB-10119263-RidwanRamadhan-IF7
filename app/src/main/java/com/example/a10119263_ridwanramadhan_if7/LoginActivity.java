package com.example.a10119263_ridwanramadhan_if7;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;


//IDENTITAS PENGERJAAN TUGAS :
//Tanggal : 22 April 2022
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7


public class LoginActivity extends AppCompatActivity {
    
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton facebook, google, twitter;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        tabLayout   = findViewById(R.id.tab_page);
        viewPager   = findViewById(R.id.view_page);
        facebook    = findViewById(R.id.facebook);
        google      = findViewById(R.id.google);
        twitter     = findViewById(R.id.twitter);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Registrasi"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(), this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        facebook.setTranslationY(300);
        google.setTranslationY(300);
        twitter.setTranslationY(300);
        tabLayout.setTranslationY(300);

        facebook.setAlpha(v);
        google.setAlpha(v);
        twitter.setAlpha(v);
        tabLayout.setAlpha(v);

        facebook.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
    }

    public void LoginKey(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}