package com.javaweb;

/**
 * Created by Dron on 22-Nov-16.
 */
public abstract class Logger {
    private int priority;
    private Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    abstract void write(String message);
}
