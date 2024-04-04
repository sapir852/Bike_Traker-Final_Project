package com.sapir.bike_traker_final_project;

import android.app.Application;

public class App  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MCT5.initHelper();
    }
}
