package com.example.cleanarchitecture.data.source;

import android.support.annotation.NonNull;

import com.example.cleanarchitecture.data.model.Model;
import com.example.cleanarchitecture.task.UseCase;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Response;

/**
 * Created by Hwang on 2018-03-20.
 *
 * Description :
 */
public interface UsersDataSource {
//    Observable<Response<Model.Root<List<Model.User>>>> getUsers();
//    Observable<Response<Model.Root<List<Model.User>>>> getSearchedUsers(int age);
//    Observable<Response<Model.Root<Model.User>>> getUser(int id);
    Observable<List<Model.User>> getUsers();
    Observable<List<Model.User>> getSearchedUsers(int age);
    Observable<Model.User> getUser(int id);
    void cacheUsers(@NonNull Model.User user);
}
