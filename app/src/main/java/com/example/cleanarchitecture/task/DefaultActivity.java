package com.example.cleanarchitecture.task;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Hwang on 2018-03-20.
 *
 * Description :
 */
public class DefaultActivity extends AppCompatActivity {
    public void addFragment(@NonNull Fragment fragment, int frameId) {
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }
}
