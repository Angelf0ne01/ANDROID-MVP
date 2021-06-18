package com.example.mvp_login.Login;

public class LoginActivityModel implements LoginMVP.Model{
    private LoginRepository repository;

    public LoginActivityModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
