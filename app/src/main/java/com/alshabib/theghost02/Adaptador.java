package com.alshabib.theghost02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context context;
    String [][] data;
    int [] img;

    public Adaptador (Context context, String[][] data, int [] img)
    {
        this.context = context;
        this.data = data;
        this.img = img;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View view1 = inflater.inflate(R.layout.customlayout,null);
        return null;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
