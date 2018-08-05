package com.sczhaoqi.demo;

import com.sczhaoqi.demo.helloworlddemo.StringProvider;
import com.sczhaoqi.demo.helloworlddemo.StringWritingApplet;
import com.sczhaoqi.demo.helloworlddemo.PrintStreamWriter;

public class Configuration {

    public static MyApplet getMainApplet() {
        return new StringWritingApplet(new PrintStreamWriter(System.out), new StringProvider() {
            public String get() {
                return "Hello World!";
            }
        });
    }
}
