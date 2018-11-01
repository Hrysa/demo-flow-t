package com.mokyun.android.course;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.eevoe.flow.FlowActivity;
import com.mokyun.android.course.ui.LoginFragment;

public class MainActivity extends FlowActivity {

    @Override
    public int getContextViewId() {
        return R.id.course;
    }

    @Override
    protected Fragment onCreateFlow(Bundle bundle) {
        return new LoginFragment();
    }
}
