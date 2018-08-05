package com.sczhaoqi.demo.helloworlddemo;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {
    private PrintStream destination;

    public PrintStreamWriter(PrintStream destination) {
        super();
        this.destination = destination;
    }

    public void write(String string) {
        destination.println(string);
    }
}
