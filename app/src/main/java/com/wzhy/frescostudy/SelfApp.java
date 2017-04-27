package com.wzhy.frescostudy;

import android.app.Application;
import android.content.Context;

/**
 * Created by wangzhengyang on 2017/4/27.
 */

public class SelfApp extends Application {

    private static SelfApp app;

    public static SelfApp getApp(){
        return app;
    }

    public static Context getAppContext(){
        return app.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
