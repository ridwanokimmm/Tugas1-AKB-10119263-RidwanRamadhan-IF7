package com.example.a10119263_ridwanramadhan_if7;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

//IDENTITAS PENGERJAAN TUGAS :
//Tanggal : 22 April 2022
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context   = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginTab loginTab = new LoginTab();
                return loginTab;
            case 1:
                RegistrasiTab RegistrasiTab = new RegistrasiTab();
                return RegistrasiTab;
            default:
                return null;
        }
    }
}
