package com.mokyun.android.course;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.eevoe.flow.FlowFragment;

public class TestFragment extends FlowFragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater) {
        hideNav();
        return new LinearLayout(getContext());
        //return layoutInflater.inflate(R.layout.main, null, false);
    }
}
