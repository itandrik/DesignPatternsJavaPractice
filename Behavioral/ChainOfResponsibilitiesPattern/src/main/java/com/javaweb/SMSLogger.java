package com.javaweb;


public class SMSLogger extends Logger{

    public SMSLogger(int priority) {
        super(priority);
    }

    void write(String message) {
        System.out.println("SMS message : " + message);
    }

}
