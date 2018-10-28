package com.mokyun.android.course;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eevoe.flow.FlowActivity;

public class MainActivity extends FlowActivity {

    @Override
    public int getContextViewId() {
        return R.id.course;
    }

    @Override
    protected Fragment onCreateFlow(Bundle bundle) {
        return new TestFragment();
    }
}
