package com.orange.test.crudwebservice.retro;

public class ApiUtil {

    private static final String BASE_URL = "https://evenement.azurewebsites.net/";

    public static RetrofitInterface getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }
}
