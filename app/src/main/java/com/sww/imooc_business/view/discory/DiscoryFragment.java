package com.sww.imooc_business.view.discory;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sww.imooc_business.R;

public class DiscoryFragment extends Fragment {

    public static DiscoryFragment newInstance() {
        DiscoryFragment discoryFragment = new DiscoryFragment();
        return discoryFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_discover, container, false);
        return rootView;
    }

}
