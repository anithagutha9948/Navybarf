package com.example.sreekanthp.navybar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Sreekanthp on 25-10-2017.
 */

public class PhotoGallery extends Fragment {
    GridView gridView;
    String[]hub={"BEDROOM","POOL","KITCHEN","LAWN","DINNING","HALL"};
    int[]images={R.drawable.bed5,R.drawable.pool1,R.drawable.kitchen11,R.drawable.lawn5,R.drawable.dinn5,R.drawable.hall5};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.photogrid, container, false);
        MyAdapter gridview2=new MyAdapter(getActivity(),hub,images);
        gridView= (GridView) view.findViewById(R.id.grid);
        gridView.setAdapter(gridview2);
        return  view;
    }
}
