package com.example.lianxi.model;

import com.example.lianxi.contract.MainContract;
import com.example.lianxi.net.Callback;
import com.example.lianxi.net.RetrofitUtils;

public class MainModel implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModel(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, Callback<T> callback) {
        RetrofitUtils.getInstance().get(url, callback);
    }
}
