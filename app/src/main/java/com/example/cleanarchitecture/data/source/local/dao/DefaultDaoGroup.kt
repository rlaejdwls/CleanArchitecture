package com.example.cleanarchitecture.data.source.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.cleanarchitecture.data.model.Model
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by Hwang on 2018-03-27.
 *
 * Description :
 */
interface DefaultDaoGroup {
    @Dao
    interface UserDao {
        @Query("SELECT * FROM user")
        fun getUsers(): List<Model.User>

        @Query("SELECT * FROM user WHERE id = :userId")
        fun getUser(userId: Int): Single<Model.User>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insert(user: Model.User)
    }
}