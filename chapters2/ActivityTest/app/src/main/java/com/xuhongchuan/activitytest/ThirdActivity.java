package com.xuhongchuan.activitytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

/**
 * Created by xuhongchuan on 16/5/13.
 */
public class ThirdActivity extends AppCompatActivity {

    Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d("ThirdActivity", "Task id is " + getTaskId());
    }
}
