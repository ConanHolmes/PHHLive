package com.ningjiahao.phhlive.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.adpter.MainViewPagerAdapter;
import com.ningjiahao.phhlive.base.BaseActivity;
import com.ningjiahao.phhlive.fragment.AttentionFragment;
import com.ningjiahao.phhlive.fragment.HotFragment;
import com.ningjiahao.phhlive.fragment.NewFragment;
import com.ningjiahao.phhlive.fragment.ZuiXinFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private RadioButton home,live,me;
    private ViewPager main_viewpager;
    private TabLayout main_tablayout;
    private ImageView head_search,head_rank;
    String[] title={"热门","最新","关注"};
    private List<Fragment> list=new ArrayList<>();
    private MainViewPagerAdapter mainViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
        initView();
    }
//583b9bcdaed179021400030c
    private void initFragment() {
        HotFragment hotFragment=new HotFragment();
        AttentionFragment attentionFragment=new AttentionFragment();
        ZuiXinFragment zuiXinFragment=new ZuiXinFragment();
        list.add(hotFragment);
        list.add(zuiXinFragment);
        list.add(attentionFragment);
        mainViewPagerAdapter=new MainViewPagerAdapter(getSupportFragmentManager(),title,list);
    }

    private void initView() {
        home= (RadioButton) findViewById(R.id.home);
        live= (RadioButton) findViewById(R.id.live);
        me= (RadioButton) findViewById(R.id.me);
        head_rank= (ImageView) findViewById(R.id.head_rank);
        head_rank.setOnClickListener(this);
        head_search= (ImageView) findViewById(R.id.head_search);
        head_search.setOnClickListener(this);
        main_viewpager= (ViewPager) findViewById(R.id.main_viewpager);
        main_viewpager.setAdapter(mainViewPagerAdapter);
        main_viewpager.setOffscreenPageLimit(5);
        main_tablayout= (TabLayout) findViewById(R.id.main_tablayout);
        main_tablayout.setupWithViewPager(main_viewpager);
        home.setOnClickListener(this);
        live.setOnClickListener(this);
        me.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home:
                break;
            case R.id.live:
                Intent intent=new Intent(mContext,RecorderNoSkinActivity.class);
                mContext.startActivity(intent);
                break;
            case R.id.me:
                break;
            case R.id.head_rank:
                break;
            case R.id.head_search:
                break;
        }
    }
}
