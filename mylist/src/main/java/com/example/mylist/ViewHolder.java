package com.example.mylist;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lenovo Le on 2016/5/19.
 */
public class ViewHolder {

    private SparseArray<View> mViews;


    private int mpostion;
    private View mConvertView;


    public ViewHolder(Context context, int i, int layoutid, ViewGroup viewGroup) {

        this.mpostion = i;
        this.mViews = new SparseArray<View>();

        mConvertView = LayoutInflater.from(context).inflate(layoutid,viewGroup,false);
        mConvertView.setTag(this);

    }

    public View getCovertView(){
        return mConvertView;
    }



    public static ViewHolder get(Context context, View convertView, int i, int layoutid, ViewGroup viewGroup) {

        if (convertView == null){

            return new ViewHolder( context,  i,  layoutid, viewGroup);
        } else {

            ViewHolder holder = (ViewHolder) convertView.getTag();
            return holder;
        }

    }


    public <T extends View> T getView(int id){


        View view = mViews.get(id);

        if(view == null){
            view = mConvertView.findViewById(id);
        mViews.put(id,view);

        }

        return (T)view;
    }

}
