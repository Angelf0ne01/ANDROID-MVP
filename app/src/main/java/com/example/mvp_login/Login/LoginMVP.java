package com.example.mvp_login.Login;

public interface LoginMVP {
    interface View{
        String getEmail();
        String getPassword();

        void showMessageUserLogin();
        void showMessageUserError();

    }

    interface Presenter{
        void setView(LoginMVP.View view);
        void loginBtnClicked();
    }

    interface  Model{
        User getUser();
    }
}
