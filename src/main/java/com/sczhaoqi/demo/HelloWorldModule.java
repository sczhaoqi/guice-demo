package com.sczhaoqi.demo;

import com.google.inject.AbstractModule;
import com.sczhaoqi.demo.helloworlddemo.MyDestination;
import com.sczhaoqi.demo.helloworlddemo.PrintStreamWriter;
import com.sczhaoqi.demo.helloworlddemo.StringWritingApplet;

import java.io.PrintStream;

public class HelloWorldModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(MyApplet.class).to(StringWritingApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);
        bind(String.class).annotatedWith(Output.class).toInstance("Hello world!");
    }
}
