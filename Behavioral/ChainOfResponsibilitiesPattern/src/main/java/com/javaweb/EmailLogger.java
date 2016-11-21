package com.javaweb;


public class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("E-mail message : " + message);
    }
}
