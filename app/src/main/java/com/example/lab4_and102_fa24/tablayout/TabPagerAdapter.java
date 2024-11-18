package com.example.lab4_and102_fa24.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lab4_and102_fa24.fragment.HomeFragment;
import com.example.lab4_and102_fa24.fragment.Tab1Fragment;
import com.example.lab4_and102_fa24.fragment.Tab2Fragment;

public class TabPagerAdapter extends FragmentStateAdapter {

    public static final String[] title = new String[]{ "Tablayout 1", "Tablayout 2"};

    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();

            case 1:
                return new Tab2Fragment();
        }
        return new HomeFragment();
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
