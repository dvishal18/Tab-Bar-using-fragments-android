package com.appproj.vd.vishaldarekarglynk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DesignFragment extends Fragment {

    public static final String TITLE = "Design";

    public static DesignFragment newInstance() {

        return new DesignFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_design, container, false);
    }
}