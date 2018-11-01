package com.mokyun.android.course.service;

import android.os.Binder;
import android.util.Log;

import java.util.logging.Logger;

public class MainBinder extends Binder {

    public void startDownload(){

        //下载任务
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.e("Logger", "数据下载中。。。。。。。");
            }
        }).start();
    }

}
