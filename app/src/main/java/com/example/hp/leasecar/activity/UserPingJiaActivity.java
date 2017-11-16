package com.example.hp.leasecar.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.adapter.PingJiaAdapter;
import com.example.hp.leasecar.bean.PingJiaBean;

import java.util.ArrayList;
import java.util.List;

public class UserPingJiaActivity extends AppCompatActivity implements View.OnClickListener {

    private List<PingJiaBean> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_ping_jia);
        initView();
    }

    private void initView() {
        TextView tvTitle = (TextView) findViewById(R.id.tv_title);
        tvTitle.setText("评价");
        ImageView ivBack = (ImageView) findViewById(R.id.iv_back);
        ivBack.setVisibility(View.VISIBLE);
        ivBack.setOnClickListener(this);

        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new PingJiaAdapter(this,data));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
