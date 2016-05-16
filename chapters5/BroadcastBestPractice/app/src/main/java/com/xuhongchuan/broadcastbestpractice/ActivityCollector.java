package com.xuhongchuan.broadcastbestpractice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuhongchuan on 16/5/15.
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
