package com.example.mvp_login.Login;

public class MemoryRepository implements LoginRepository{
    private  User user;
    @Override
    public void saveUser(User user) {

    }

    @Override
    public User getUser() {
        if(user==null){
            return new  User("test@test.com","1234");
        }
        return user;
    }
}
