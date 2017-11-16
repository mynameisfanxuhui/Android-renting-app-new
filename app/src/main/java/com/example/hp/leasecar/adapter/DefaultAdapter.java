package com.example.hp.leasecar.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by HP on 2017/5/3.
 */

public abstract class DefaultAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected List<T> mData;

    public DefaultAdapter(Context context, List<T> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData == null?0:mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData == null?null:mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public abstract View getView(int i, View view, ViewGroup viewGroup);
}
