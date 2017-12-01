package com.example.deniz.exampleandroidapp.dependencyInjection;

import android.app.Application;

import com.example.deniz.exampleandroidapp.view.list.ListFragment;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Created by Deniz on 30.11.2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class, ServiceModule.class})
public interface ApplicationComponent {

    void inject(ListFragment listFragment);
    //void inject(CreateFragment createFragment);
    //void inject(DetailFragment detailFragment);

    Application application();
}