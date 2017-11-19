package com.example.hp.leasecar.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.hp.leasecar.R;
import com.example.hp.leasecar.fragment.BusinessServiceRankingFragment;
import com.example.hp.leasecar.fragment.HomeFragment;
import com.example.hp.leasecar.fragment.UserCenterFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private ArrayList<Fragment> fragments;
    private TextView tvTitle;
    private BottomNavigationBar bottomNavigationBar;
    private static final String[] TITLE = {"首页","订单","商家服务排行榜","个人中心"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initBottomBar();
    }

    private void initView() {
        tvTitle = (TextView) findViewById(R.id.tv_title);
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
    }

    private void initBottomBar() {
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.menu1, TITLE[0]).setActiveColorResource(android.R.color.holo_orange_dark))
                .addItem(new BottomNavigationItem(R.mipmap.menu2, TITLE[1]).setActiveColorResource(android.R.color.holo_blue_dark))
                .addItem(new BottomNavigationItem(R.mipmap.menu3, TITLE[2]).setActiveColorResource(android.R.color.holo_green_dark))
                .addItem(new BottomNavigationItem(R.mipmap.menu4, TITLE[3]).setActiveColorResource(android.R.color.holo_purple))
                .setFirstSelectedPosition(0)
                .initialise();

        fragments = getFragments();
        setDefaultFragment();
        bottomNavigationBar.setTabSelectedListener(this);
    }

    /**
     * 设置默认的
     */
    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.layFrame, new HomeFragment());
        transaction.commit();
        tvTitle.setText(TITLE[0]);
    }

    private ArrayList<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        fragments.add(new BusinessServiceRankingFragment());
        fragments.add(new UserCenterFragment());
        return fragments;
    }

    @Override
    public void onTabSelected(int position) {
        if (fragments != null) {
            if (position < fragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = fragments.get(position);
                if (fragment.isAdded()) {
                    ft.replace(R.id.layFrame, fragment);
                } else {
                    ft.add(R.id.layFrame, fragment);
                }
                ft.commitAllowingStateLoss();
                tvTitle.setText(TITLE[position]);
            }
        }
    }

    @Override
    public void onTabUnselected(int position) {
        if (fragments != null) {
            if (position < fragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = fragments.get(position);
                ft.remove(fragment);
                ft.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabReselected(int position) {

    }
}
