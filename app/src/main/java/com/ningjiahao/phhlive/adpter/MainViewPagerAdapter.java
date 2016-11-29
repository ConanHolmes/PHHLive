package com.ningjiahao.phhlive.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 甯宁寧 on 2016-11-28.
 */

public class MainViewPagerAdapter extends FragmentPagerAdapter{
    private String[] title;
    private List<Fragment> list;
    public MainViewPagerAdapter(FragmentManager fm,String[] title,List<Fragment> list) {
        super(fm);
        this.title=title;
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
