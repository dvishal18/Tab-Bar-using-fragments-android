package com.appproj.vd.vishaldarekarglynk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PoliticsFragment extends Fragment {

    public static final String TITLE = "Politics";

    public static PoliticsFragment newInstance() {

        return new PoliticsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_politics, container, false);
    }
}