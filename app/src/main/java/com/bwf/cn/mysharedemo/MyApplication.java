package com.bwf.cn.mysharedemo;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;

/**
 * Created by admin on 2016/8/10.
 */
public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");//appkey appsecret 需要到开放平台注册
    }
}
