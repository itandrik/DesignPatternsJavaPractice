package com.javaweb;


public class App {
    public static void main( String[] args ) {
        SMSLogger logger0 = new SMSLogger(Level.ERROR);
        FileLogger logger1 = new FileLogger(Level.DEBUG);
        EmailLogger logger2 = new EmailLogger(Level.INFO);
        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.writeMessage("All is good;",Level.INFO);
        logger0.writeMessage("Debug is running", Level.DEBUG);
        logger0.writeMessage("System falls down", Level.ERROR);
    }
}
