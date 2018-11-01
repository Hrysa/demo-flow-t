package com.mokyun.android.course.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.mokyun.android.course.R;

public class MainService extends Service {

    private MainBinder binder = new MainBinder();
    private static final int NOTIFICATION_FLAG = 1;

    @Override
    public void onCreate() {

        super.onCreate();

        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification myNotify = new Notification();
        myNotify.icon = R.mipmap.ic_launcher;
        myNotify.tickerText = "TickerText:您有新短消息，请注意查收！";
        myNotify.when = System.currentTimeMillis();
        myNotify.flags = Notification.FLAG_NO_CLEAR;// 不能够自动清除
//        RemoteViews rv = new RemoteViews(getPackageName(),
//                R.layout.my_notification);
//        rv.setTextViewText(R.id.text_content, "hello wrold!");
//        myNotify.contentView = rv;
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        PendingIntent contentIntent = PendingIntent.getActivity(this, 1,
//                intent, 1);
//        myNotify.contentIntent = contentIntent;
//        manager.notify(NOTIFICATION_FLAG, myNotify);
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
//        return mStub;
        return null;
    }
//    /**AIDL的使用*/
//    MyAIDLService.Stub mStub = new MyAIDLService.Stub() {
//        @Override
//        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
//
//        }
//
//        @Override
//        public int plus(int a, int b) throws RemoteException {
//            return a + b;
//        }
//    };
}

/**
 *  @see <a href="https://www.jianshu.com/p/b62aed2253f6">more</a>
 */
