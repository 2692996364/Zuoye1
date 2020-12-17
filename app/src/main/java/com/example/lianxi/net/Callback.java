package com.example.lianxi.net;

public interface Callback<T> {
    void onSuccess(T t);
    void onFail(String msg);
}