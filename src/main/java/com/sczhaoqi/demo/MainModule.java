package com.sczhaoqi.demo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.sczhaoqi.demo.helloworlddemo.MyDestination;
import com.sczhaoqi.demo.helloworlddemo.PrintStreamWriter;
import com.sczhaoqi.demo.helloworlddemo.StringWritingApplet;

import java.io.PrintStream;

public class MainModule
        extends AbstractModule
{

    @Override
    protected void configure()
    {
        install(new HelloWorldModule());
    }
//    @Provides
//    private String getString(){
//        return "hello world!";
//    }
}
