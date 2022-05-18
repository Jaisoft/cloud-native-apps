package com.example.jaime.daggerpoc.model.di;
import android.app.Application;

public class UserApp extends Application{

    private UserComponent userComponent;
    @Override
    public void onCreate(){
        super.onCreate();

        userComponent = DaggerUserComponent.builder().userModule(new UserModule()).build();

    }

    public UserComponent getUserComponent(){
        return userComponent;
    }
}
