package com.example.lianxi.contract;

import com.example.lianxi.base.BaseView;
import com.example.lianxi.bean.UserBean;
import com.example.lianxi.net.Callback;

public class MainContract {
    public interface IMainModel {
        <T> void getLoginData(String url, Callback<T> callback);
    }
    public interface IMainPresenter {
        void login(String name, String password);
        void loginResult(String result);
    }
    public interface IMainView extends BaseView {
        String getUserName();
        String getPassword();
        void getLoginData(UserBean userBean);
    }
}
