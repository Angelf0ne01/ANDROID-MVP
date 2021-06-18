package com.example.mvp_login.root;

import android.app.Application;

import com.example.mvp_login.Login.LoginModule;

public class App  extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerApplicationComponent.
                builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
