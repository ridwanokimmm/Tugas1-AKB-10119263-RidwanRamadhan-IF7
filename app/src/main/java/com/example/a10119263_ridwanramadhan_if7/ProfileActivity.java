package com.example.a10119263_ridwanramadhan_if7;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//IDENTITAS PENGERJAAN TUGAS :
//Tanggal : 23 April 2022
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_profile);
    }

    public void Home(View view) {
        Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(intent);
    }
}