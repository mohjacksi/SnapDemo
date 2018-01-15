package com.mohjacksi.snapdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mohjacksi on 1/4/18.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatFragment();
            case 1:
                return new EmptyFragment();
            case 2:
                return new StoryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
