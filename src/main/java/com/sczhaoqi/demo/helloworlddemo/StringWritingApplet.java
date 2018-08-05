package com.sczhaoqi.demo.helloworlddemo;

import com.google.inject.Provider;
import com.sczhaoqi.demo.MyApplet;
import com.sczhaoqi.demo.Output;

import javax.inject.Inject;

public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
        super();
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void printHelloWorld() {
        destination.write(stringProvider.get());
    }

    public void run() {
        printHelloWorld();
    }
}
