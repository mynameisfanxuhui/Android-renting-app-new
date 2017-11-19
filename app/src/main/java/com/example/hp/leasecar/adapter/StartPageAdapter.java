package com.example.hp.leasecar.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.hp.leasecar.R;
import com.example.hp.leasecar.Picture;
import java.util.ArrayList;
import java.util.List;
public class StartPageAdapter extends BaseAdapter {
    private Context context;
    private GridView mGv;
    private List<Picture> pictures;
    private static int ROW_NUMBER = 3;

    /**
     * 数据资源：标题 ＋ 图片
     * */
    private String[] arrText = new String[]{
            "南京租车", "北京租车", "上海租车",
            "广东租车", "山东租车", "河北租车",
            "陕西租车", "广西租车", "海南租车"
    };
    private int[] arrImages = new int[]{
              R.mipmap.shanghai, R.mipmap.beijing, R.mipmap.hebei,
            R.mipmap.shanxi, R.mipmap.shanghai, R.mipmap.shandong,
            R.mipmap.hainan, R.mipmap.guangxi, R.mipmap.beijing,
    };

    public StartPageAdapter(Context context, GridView gv) {
        this.context = context;
        this.mGv = gv;
        pictures = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Picture pt = new Picture(arrText[i], arrImages[i]);
            pictures.add(pt);
        }

    }

    @Override
    public int getCount() {
        if (null != pictures) {
            return pictures.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return pictures.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_startpage_grid, null);
            holder.iv = (ImageView) convertView.findViewById(R.id.iv_item);
            //设置显示图片
            holder.iv.setBackgroundResource(arrImages[position]);
            holder.tv = (TextView) convertView.findViewById(R.id.tv_item);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        //高度计算
        AbsListView.LayoutParams param = new AbsListView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                mGv.getHeight() / ROW_NUMBER);

        convertView.setLayoutParams(param);
        return convertView;
    }

    class Holder {
        ImageView iv;
        TextView tv;
    }
}