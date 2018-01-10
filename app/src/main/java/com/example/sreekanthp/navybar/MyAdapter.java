package com.example.sreekanthp.navybar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sreekanthp on 26-10-2017.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    String[] hub;
    int[] images;
    ImageView imageView;
    TextView textView;

    public MyAdapter(Context c, String[] hub, int[] image) {
        this.context = c;
        this.hub = hub;
        this.images = image;


    }


    @Override
    public int getCount() {
        return hub.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        grid=new View(context);
        grid = inflater.inflate(R.layout.gallery_row, null);
        textView = (TextView) grid.findViewById(R.id.hub);
        imageView = (ImageView) grid.findViewById(R.id.iv);
        textView.setText(hub[i]);
        imageView.setImageResource(images[i]);
        return grid;
    }

}