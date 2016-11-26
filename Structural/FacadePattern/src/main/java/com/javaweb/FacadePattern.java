package com.javaweb;

/**
 * Hello world!
 */
public class FacadePattern {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer{
    private Power power = new Power();
    private DVDRom dvd = new DVDRom();
    private HDD hdd = new HDD();

    public void copy(){
        power.on();

        dvd.load();

        hdd.copyFromDVD(dvd);
    }
}
class Power {
    void on() {
        System.out.println("On");
    }

    void off() {
        System.out.println("off");
    }
}

class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}
class HDD{
    public void copyFromDVD(DVDRom dvdRom){
        if(dvdRom.hasData()){
            System.out.println("Copying data from disk...");
        } else {
            System.out.println("Insert disk with data...");
        }
    }
}
