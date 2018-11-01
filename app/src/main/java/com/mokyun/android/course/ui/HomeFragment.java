package com.mokyun.android.course.ui;

import android.view.View;
import android.widget.Button;

import com.eevoe.flow.FlowFragment;
import com.eevoe.flow.annotation.FlowBindView;
import com.mokyun.android.course.R;

import butterknife.BindView;
import butterknife.ButterKnife;

@FlowBindView(view = R.layout.home, hideNav = true)
public class HomeFragment extends FlowFragment {

    @Override
    public void initView(View view) {
    }
}
