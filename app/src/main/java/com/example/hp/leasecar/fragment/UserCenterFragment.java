package com.example.hp.leasecar.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.activity.UserCollectActivity;
import com.example.hp.leasecar.activity.UserPingJiaActivity;
import com.example.hp.leasecar.activity.UserSettingActivity;

/**
 * Created by HP on 2017/5/3.
 */

public class UserCenterFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_usercenter,null);
        initView(view);
        return view;

    }

    private void initView(View view) {
        view.findViewById(R.id.iv_user_head).setOnClickListener(this);
        view.findViewById(R.id.tv_user_collect).setOnClickListener(this);
        view.findViewById(R.id.tv_user_pingjia).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_user_head://个人设置页面
                startActivity(new Intent(getActivity(),UserSettingActivity.class));
                break;
            case R.id.tv_user_collect://收藏页面
                startActivity(new Intent(getActivity(),UserCollectActivity.class));
                break;
            case R.id.tv_user_pingjia://评价页面
                startActivity(new Intent(getActivity(),UserPingJiaActivity.class));
                break;
        }
    }
}
