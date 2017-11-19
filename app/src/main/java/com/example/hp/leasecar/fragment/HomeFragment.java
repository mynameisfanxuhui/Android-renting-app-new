package com.example.hp.leasecar.fragment;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.activity.RankingActivity;
import com.example.hp.leasecar.activity.StartPageActivity;
import com.example.hp.leasecar.activity.UserCollectActivity;
import com.example.hp.leasecar.activity.UserPingJiaActivity;
import com.example.hp.leasecar.activity.UserSettingActivity;
import com.example.hp.leasecar.adapter.StartPageAdapter;


public class HomeFragment extends Fragment implements View.OnClickListener  {
    private GridView mGridView;
    private String IMAGE_ITEM = "imgage_item";
    private String TEXT_ITEM = "text_item";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_entry,null);
        initView(view);
        return view;

    }

    private void initView(View view) {
        view.findViewById(R.id.startPageEntry).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startPageEntry://个人设置页面
                startActivity(new Intent(getActivity(),StartPageActivity.class));
                break;
        }
    }
}