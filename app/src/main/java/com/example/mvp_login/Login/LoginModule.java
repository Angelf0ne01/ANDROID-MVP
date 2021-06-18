package com.example.mvp_login.Login;

import dagger.Module;
import dagger.Provides;
@Module
public class LoginModule {
    @Provides
    public  LoginMVP.Presenter providerLoginActivityPresenter(LoginMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public  LoginMVP.Model providerLoginActivityModel(LoginRepository repository){
        return new LoginActivityModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }

}
