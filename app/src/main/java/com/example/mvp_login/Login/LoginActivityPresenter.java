package com.example.mvp_login.Login;

import android.util.Log;

import androidx.annotation.Nullable;

public class LoginActivityPresenter implements LoginMVP.Presenter {
    @Nullable
    private   LoginMVP.View view;
    private   LoginMVP.Model model;

    public LoginActivityPresenter(LoginMVP.Model model){
        this.model = model;
    }
    @Override
    public void setView(LoginMVP.View view) {
        this.view=view;
    }

    @Override
    public void loginBtnClicked() {
        if(view !=null){
            String email = view.getEmail();
            String password= view.getPassword();
            if(model.getUser().getEmail().equals(email) && model.getUser().getPassword().equals(password)){
                view.showMessageUserLogin();
            }else{
                view.showMessageUserError();
            }

        }

    }
}
