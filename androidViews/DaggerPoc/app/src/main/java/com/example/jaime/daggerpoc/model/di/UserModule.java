package com.example.jaime.daggerpoc.model.di;
import com.example.jaime.daggerpoc.model.User;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
@Module
public class UserModule {
    @Singleton
    @Provides
    public User providesUser(){
        return new User("Jaime");
    }
}
