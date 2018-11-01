package com.mokyun.android.course.ui;

import android.view.View;
import android.widget.Button;

import com.eevoe.flow.FlowFragment;
import com.eevoe.flow.annotation.FlowBindView;

import com.mokyun.android.course.R;

import butterknife.BindView;
import butterknife.ButterKnife;

@FlowBindView(view = R.layout.login, hideNav = true)
public class LoginFragment extends FlowFragment {
    @BindView(R.id.login_button)
    Button loginButton;


    @Override
    public void initView(View view) {
        loginButton = view.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push(new HomeFragment());
            }
        });
    }
}
