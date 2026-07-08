package com.example;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Hello World");
    }

    // ✅ Add this method
    public int add(int a, int b) {
        return a + b;
    }
}
