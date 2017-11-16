package com.example.hp.leasecar.fragment;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.activity.RankingActivity;
import com.example.hp.leasecar.activity.UserCollectActivity;
import com.example.hp.leasecar.activity.UserPingJiaActivity;
import com.example.hp.leasecar.activity.UserSettingActivity;

/**
 * Created by 53519 on 2017/5/9.
 */

public class BusinessServiceRankingFragment extends Fragment implements View.OnClickListener  {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rank_entery,null);
        initView(view);
        return view;

    }

    private void initView(View view) {
        view.findViewById(R.id.rankingEntry).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rankingEntry://个人设置页面
                startActivity(new Intent(getActivity(),RankingActivity.class));
                break;
        }
    }
}
