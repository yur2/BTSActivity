package com.example.yurina.btsactivity;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

class PaperAdapter extends FragmentStatePagerAdapter {
    public PaperAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);

    }

    @Override
    public Fragment getItem(int i) {
        return null;
    }


    @Override
    public int getCount() {
        return 3;
    }

//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
//        return false;
//    }
}
