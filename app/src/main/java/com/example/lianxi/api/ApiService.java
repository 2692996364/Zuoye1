package com.example.lianxi.api;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Observable<ResponseBody> get(@Url String url);

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url);
}