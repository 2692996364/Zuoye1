package com.example.lianxi.presenter;

import com.example.lianxi.base.BasePresenter;
import com.example.lianxi.bean.UserBean;
import com.example.lianxi.contract.MainContract;
import com.example.lianxi.model.MainModel;
import com.example.lianxi.net.Callback;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {
    private MainContract.IMainModel mainModel;

    public MainPresenter(MainContract.IMainModel mainModel) {
        this.mainModel = new MainModel(this);
    }

    @Override
    public void login(String name, String password) {

    }

    @Override
    public void loginResult(String result) {
        mainModel.getLoginData(result, new Callback<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iView.getLoginData(userBean);
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }
}
