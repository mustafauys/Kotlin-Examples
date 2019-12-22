package com.mustafauysal.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Set Log Level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("86xW20nkDlHk32KRmqrHeRk1rm7CefVFTFNlcNz5")
                .clientKey("bEXQDEz01JO8bS8ZaHgo3oq0A5Dfx8deJpPfgwLb")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
