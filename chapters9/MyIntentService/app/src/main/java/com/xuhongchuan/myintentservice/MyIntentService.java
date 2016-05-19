package com.xuhongchuan.myintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by xuhongchuan on 16/5/19.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("MyIntentService", "Thread id is " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService", "onDestory executed");
    }
}
