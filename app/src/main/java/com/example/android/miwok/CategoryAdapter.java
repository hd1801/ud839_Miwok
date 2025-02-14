package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context mContext ,FragmentManager fm)
    {
        super(fm);
        this.mContext=mContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new NumberFragment();
            case 1:
                return new ColorsFragment();
            case 2:
                return new FamilyFragment();
            default:
                return new PhrasesFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return mContext.getString(R.string.category_numbers);
            case 1:
                return mContext.getString(R.string.category_colors);
            case 2:
                return mContext.getString(R.string.category_family);
            default:
                return mContext.getString(R.string.category_phrases);
        }


    }
}
