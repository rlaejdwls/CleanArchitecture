package com.example.cleanarchitecture;

import android.app.Activity;

import com.example.core.AppCore;
import com.example.core.manage.Logger;

/**
 * Created by Hwang on 2018-03-15.
 *
 * Description :
 */
public class CleanApp extends AppCore {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    protected void notifyForeground() {
        Logger.d("notifyForeground");
    }
    @Override
    protected void notifyBackground() {
        Logger.d("notifyBackground");
    }
}
