package com.example.jaime.daggerpoc.model.di;

import  com.example.jaime.daggerpoc.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;


@PerActivity
@Singleton
@Component(modules={UserModule.class})
public interface UserComponent {
    void inject(MainActivity mainActivity);
}
