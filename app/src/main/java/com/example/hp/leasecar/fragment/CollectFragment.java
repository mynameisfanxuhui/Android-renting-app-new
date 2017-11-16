package com.example.hp.leasecar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.adapter.CollectAdapter;
import com.example.hp.leasecar.bean.CollectBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 2017/5/3.
 */

public class CollectFragment extends Fragment {


    private int mPosition;
    private List<CollectBean> data = new ArrayList<>();

    public static CollectFragment getInstance(int position){
        CollectFragment instance = new CollectFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        instance.setArguments(bundle);
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mPosition = getArguments().getInt("position");
        View view = inflater.inflate(R.layout.fragment_collect,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        ListView lv = (ListView) view.findViewById(R.id.lv);
        lv.setAdapter(new CollectAdapter(getActivity(),data));
    }
}
