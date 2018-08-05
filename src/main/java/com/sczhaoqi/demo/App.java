package com.sczhaoqi.demo;

public class App {
    /**
     * bootstrap
     * parse command line
     * set up environment
     * kick off main logic
     *
     * @param args
     */
    public static void main(String[] args) {
        MyApplet mainApplet = Configuration.getMainApplet();
        mainApplet.run();
    }
}
