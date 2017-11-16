package com.example.hp.leasecar.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.fragment.CollectFragment;
import com.example.hp.leasecar.view.FlymeTabStrip;

public class UserCollectActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] titles = new String[] { "  单车  ", "  汽车  ", "  巴士  "};

    public class CollectTabAdapter extends FragmentPagerAdapter {


        public CollectTabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Fragment getItem(int position) {
            return CollectFragment.getInstance(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_collect);
        initView();
        initTab();
    }

    private void initView() {
        TextView tvTitle = (TextView) findViewById(R.id.tv_title);
        tvTitle.setText("商家收藏");
        ImageView ivBack = (ImageView) findViewById(R.id.iv_back);
        ivBack.setVisibility(View.VISIBLE);
        ivBack.setOnClickListener(this);
        ImageView ivMenu = (ImageView) findViewById(R.id.iv_menu);
        ivMenu.setImageResource(R.mipmap.menu_search);
        ivMenu.setVisibility(View.VISIBLE);
        ivMenu.setOnClickListener(this);
    }

    private void initTab() {
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new CollectTabAdapter(getSupportFragmentManager()));
        FlymeTabStrip tabStrip = (FlymeTabStrip) findViewById(R.id.tabstrip);
        tabStrip.setViewPager(mViewPager);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_menu:
                //TODO 搜索按钮点击
                break;
        }
    }
}
