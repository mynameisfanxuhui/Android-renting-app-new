package com.example.hp.leasecar.activity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.app.Activity;
import com.example.hp.leasecar.R;
import com.example.hp.leasecar.activity.RankingActivity;
import com.example.hp.leasecar.activity.UserCollectActivity;
import com.example.hp.leasecar.activity.UserPingJiaActivity;
import com.example.hp.leasecar.activity.UserSettingActivity;
import com.example.hp.leasecar.adapter.StartPageAdapter;
public class StartPageActivity extends Activity implements AdapterView.OnItemClickListener {

    /**
     * 京东相关信息
     */
    public final static String oneDealUrl = "http://union.click.jd.com/jdc?p=AyIOZRprFQoSAlcZWCVGTV8LRGtMR1dGXgVFSR1JUkpJBUkcU0QLTh"
            + "9HRwwHXRteFwARGAxeB0gMVQsQDAFBSkVEC0dXZUNTcRFFBEFaakIBR2tOX1RkHUU5XWFuVyIYC00AZFsJXidlDh43VhleHAYSB1UfaxUFF"
            + "jdlfSYlVHwHVBpaFAMTBFASaxQyEgJRHV4cBBoFVBNfEjIVNwpPHkFSUFMdRR9AUkw3ZRo%3D&t=W1dCFBBFC14NXAAECUteDEYWRQ5RUFc"
            + "ZVRNbEAAQBEpCHklfHEBZXkxPVlpQFkUHGXJTRiNfBUpWSn8QTwc%3D&e=25840255236224";
    public final static String listJson = "{\"type\": \"3\",\"blockId\":\"0\"}";//导航页


    /**
     * 新版界面相关信息：九宫格风格
     */
    private GridView mGridView;
    private String IMAGE_ITEM = "imgage_item";
    private String TEXT_ITEM = "text_item";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        mGridView = (GridView) findViewById(R.id.juhe_gridview);


        StartPageAdapter saImageItems = new StartPageAdapter(this, mGridView);

        // 设置GridView的adapter。GridView继承于AbsListView。
        mGridView.setAdapter(saImageItems);
        mGridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}