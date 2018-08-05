package com.sczhaoqi.demo.helloworlddemo;

import com.sczhaoqi.demo.MyApplet;

public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private StringProvider stringProvider;
    public StringWritingApplet(MyDestination destination, StringProvider stringProvider) {
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
