package com.javaweb;


public class Television implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is On");
    }

    @Override
    public void off() {
        System.out.println("TV is Off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume is at " + volume + " volume");
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume is at " + volume + " volume");
    }
}
