package com.example.insta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6eggyzHIEXHGaaq1X5IhqhkOFF37zyGLVfW9P7M7")
                .clientKey("Hgyw27ODu4jBhriJVYUqQu3icrF1ivHe8KAD7iZR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
