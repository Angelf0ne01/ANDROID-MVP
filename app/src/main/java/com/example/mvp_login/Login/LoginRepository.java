package com.example.mvp_login.Login;

public interface LoginRepository {
    void saveUser( User user);
    User getUser();
}
