package com.example.mvp_login.root;

import com.example.mvp_login.Login.LoginActivity;
import com.example.mvp_login.Login.LoginModule;
import com.example.mvp_login.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}
