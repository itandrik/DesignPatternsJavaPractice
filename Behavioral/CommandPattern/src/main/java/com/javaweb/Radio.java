package com.javaweb;


public class Radio implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Radio is On");
    }

    @Override
    public void off() {
        System.out.println("Radio is Off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio volume is at " + volume + " volume");
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio volume is at " + volume + " volume");
    }
}
