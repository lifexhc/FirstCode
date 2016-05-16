package com.xuhongchuan.fragmenttest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/**
 * Created by xuhongchuan on 16/5/15.
 */
public class DialogActivity extends Activity {

    public static final String TAG = "DialogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,  "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
