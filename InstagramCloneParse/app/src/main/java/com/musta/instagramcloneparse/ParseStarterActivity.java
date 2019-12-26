package com.musta.instagramcloneparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("ac9G6uLdu5QCPR0RHCSnzJanwzS5vcSta5PxBYiB")
        .clientKey("8fNE50Vw4twdL9ViSjaLL1Of8I67uma50kD22pf1")
        .server("https://parseapi.back4app.com/")
        .build()
        );
    }
}
