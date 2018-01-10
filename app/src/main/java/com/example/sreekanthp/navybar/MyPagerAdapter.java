package com.example.sreekanthp.navybar;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Sreekanthp on 08-11-2017.
 */

public class MyPagerAdapter extends PagerAdapter {
    private Context context;
    private int array_images[];
    private LayoutInflater layoutInflater;
    public MyPagerAdapter(Context context, int[] array_images) {
        this.context = context;
        this.array_images = array_images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        int length=array_images.length;
        return length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout)object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, final int p) {
        View view = layoutInflater.inflate(R.layout.item, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv);
        imageView.setImageResource(array_images[p]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}