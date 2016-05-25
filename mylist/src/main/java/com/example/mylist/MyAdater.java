package com.example.mylist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo Le on 2016/5/19.
 */
public class MyAdater extends CommenAdapter<Bean>{


    public MyAdater(List<Bean> mDatas, Context mContext) {
        super(mDatas, mContext);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder = ViewHolder.get(mContext,view,i,R.layout.item,viewGroup);
        ((ImageView)holder.getView(R.id.imageView)).setImageResource(R.mipmap.ic_launcher);
        ((TextView)holder.getView(R.id.tv)).setText(mDatas.get(i).getAge());
        return holder.getCovertView();
    }

}
