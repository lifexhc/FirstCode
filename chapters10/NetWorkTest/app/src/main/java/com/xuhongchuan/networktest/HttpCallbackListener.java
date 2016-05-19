package com.xuhongchuan.networktest;

/**
 * Created by xuhongchuan on 16/5/20.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
