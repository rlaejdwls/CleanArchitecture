package com.example.cleanarchitecture.manage.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.cleanarchitecture.data.model.Model;
import com.example.cleanarchitecture.data.source.local.dao.DefaultDaoGroup;

/**
 * Created by Hwang on 2018-03-23.
 *
 * Description :
 */
@Database(entities = { Model.User.class }, version = 1)
public abstract class ORDBM extends RoomDatabase {
    private static ORDBM instance;
    private static final Object lock = new Object();

    public abstract DefaultDaoGroup.UserDao userDao();

    public static ORDBM getInstance(Context context) {
        synchronized (lock) {
            if (instance == null) {
                instance = Room.databaseBuilder(context.getApplicationContext(), ORDBM.class, "propio.db")
                        .build();
            }
            return instance;
        }
    }
}
