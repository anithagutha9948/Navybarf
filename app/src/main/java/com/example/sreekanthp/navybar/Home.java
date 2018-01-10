package com.example.sreekanthp.navybar;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Sreekanthp on 10-11-2017.
 */


public class Home extends Fragment {
    private static final long Delay_MS = 500;
    private static final long PEROID_MS = 3000;
    private int currentPage = 0;
    private int logoimages[] = {R.drawable.homeimg5, R.drawable.homeimg6, R.drawable.homeimg7, R.drawable.homeimg5};
    private MyPagerAdapter ca;
    private ViewPager viewPager;
    private Timer timer;

    private LayoutInflater inflater;
    private ViewGroup container;
    private Bundle savedInstanceState;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.inflater = inflater;
        this.container = container;
        this.savedInstanceState = savedInstanceState;
        View view = inflater.inflate(R.layout.home, container, false);


        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        ca = new MyPagerAdapter(getActivity(), logoimages);
        viewPager.setAdapter(ca);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            int NUM_PAGES = 6;

            public void run() {

                if (currentPage == NUM_PAGES - 1) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, Delay_MS, PEROID_MS);

        return view;

    }
}