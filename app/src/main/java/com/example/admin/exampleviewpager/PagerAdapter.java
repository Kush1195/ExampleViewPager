package com.example.admin.exampleviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter
{
    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0: return new Category();
            case 1: return new Submenu();
            case 2: return new Detail();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0: return "Category";
            case 1: return "Submenu";
            case 2: return "Detail";
            default: return null;
        }
    }
}
