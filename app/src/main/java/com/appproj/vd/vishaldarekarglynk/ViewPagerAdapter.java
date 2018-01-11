package com.appproj.vd.vishaldarekarglynk;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 5;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return SportsFragment.newInstance();
            case 1:
                return TechnologiesFragment.newInstance();
            case 2:
                return DesignFragment.newInstance();
            case 3:
                return PoliticsFragment.newInstance();
            case 4:
                return MoviesFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return SportsFragment.TITLE;

            case 1:
                return TechnologiesFragment.TITLE;

            case 2:
                return DesignFragment.TITLE;

            case 3:
                return PoliticsFragment.TITLE;

            case 4:
                return MoviesFragment.TITLE;
        }
        return super.getPageTitle(position);
    }
}
