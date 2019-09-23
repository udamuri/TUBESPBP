package com.example.tubespbp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("users/read_one")
    Call<List<UsersDAO>> readOne();

    @GET("users/search/{id}")
    Call<UsersDAO> search(@Path("id") String id);

    @POST("users/create")
    @FormUrlEncoded
    Call<String> create(@Field("username") String username,
                            @Field("email") String email,
                            @Field("password") String password,
                            @Field("gender") String gender,
                            @Field("phone") String phone);

    @PUT("users/update/{id}")
    @FormUrlEncoded
    Call<String> update(@Path("id") String id,
                             @Field("username") String username,
                             @Field("password") String password,
                             @Field("gender") int gender,
                             @Field("phone") String phone);

    @DELETE("users/delete/{id}")
    Call<String> delete(@Path("id") String id);



}