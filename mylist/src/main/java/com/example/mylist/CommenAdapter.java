package com.example.mylist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public abstract class CommenAdapter<T> extends BaseAdapter {

    public List<T> mDatas;
    public Context mContext;
    public LayoutInflater inflater;

    public CommenAdapter(List<T> mDatas, Context mContext) {
        this.mDatas = mDatas;
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);

    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public abstract View getView(int i, View view, ViewGroup viewGroup);
}
