package com.xuhongchuan.broadcasttest2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by xuhongchuan on 16/5/15.
 */
public class AnotherBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "receiver in AnotherBroadcastReceiver", Toast.LENGTH_SHORT).show();
    }
}
