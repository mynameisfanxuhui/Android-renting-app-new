package com.example.hp.leasecar.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.leasecar.R;
import com.example.hp.leasecar.bean.CollectBean;

import java.util.List;

/**
 * Created by HP on 2017/5/3.
 */

public class CollectAdapter extends DefaultAdapter<CollectBean> {

    public CollectAdapter(Context context, List<CollectBean> data) {
        super(context, data);
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null){
            convertView = View.inflate(mContext, R.layout.item_collect, null);
            holder = new ViewHolder();
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    class ViewHolder{

    }
}
