package com.orange.test.crudwebservice.retro;


import com.orange.test.crudwebservice.Models.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RetrofitInterface {

    @GET("api/Users1")
    public Call<List<User>> getAllUsers();
    @GET("api/Users1/{id}")
    public Call<User> getUserById(@Path("id") int id);
    @DELETE("api/Users1/{id}")
    public Call<User> deleteUserById(@Path("id") int id);

    @FormUrlEncoded
    @POST("api/Users1/")
    public Call<User> addUser(@Field("Email") String email, @Field("FName") String fName,@Field("LName") String lName, @Field("Age") int age,@Field("PhoneNumber") String phoneNumber, @Field("Country") String country);

    @FormUrlEncoded
    @PUT("api/Users1/{id}")
    public Call<User> updateUser(@Path("id") int id,@Field("id") int idU,@Field("Email") String email, @Field("FName") String fName,@Field("LName") String lName, @Field("Age") int age,@Field("PhoneNumber") String phoneNumber, @Field("Country") String country);

}
