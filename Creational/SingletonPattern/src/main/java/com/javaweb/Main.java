package com.javaweb;

/**
 * Start point of program
 *
 * @author Andrii Chernysh
 */
public class Main {
    public static void main(String[] args) {
        // Example of using singleton
        String propValue = Configuration.getInstance().getProperty("some property");
    }
}
