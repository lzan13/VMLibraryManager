package com.vmloft.develop.library.tools.base;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzan13 on 2017/4/13.
 * 这里主要是定义一个全局的上下文对象，以后所有引用此库的项目直接使用
 */
public class VMApp extends Application {

    protected static Context context;
    private static List<VMActivity> activityList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    /**
     * 获取项目上下文对象
     */
    public static Context getContext() {
        return context;
    }

    /**
     * 添加当前活动的 Activity 到栈顶
     *
     * @param activity 当前活动的 activity
     */
    public static void putActivity(VMActivity activity) {
        if (!activityList.contains(activity)) {
            activityList.add(0, activity);
        }
    }

    /**
     * 移除一个 activity
     *
     * @param activity 要销毁的 activity
     */
    public static void removeActivity(VMActivity activity) {
        activityList.remove(activity);
    }

    /**
     * 获取栈顶的 activity
     */
    public static VMActivity getTopActivity() {
        if (activityList.size() > 0) {
            return activityList.get(0);
        }
        return null;
    }
}