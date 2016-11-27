package com.javaweb;

/**
 * Full "Builder" pattern example
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class FullBuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());

        Car car = director.buildCar();
        System.out.println(car);
    }
}
abstract class CarBuilderFull{
    Car car;
    public void createCar(){
        car = new Car();
    }
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    public Car getCar(){
        return car;
    }
}
class FordMondeoBuilder extends CarBuilderFull{

    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }
}

class SubaruBuilder extends CarBuilderFull{
    @Override
    void buildMake() {
        car.setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(220);
    }
}

class Director{
    private CarBuilderFull builder;

    void setBuilder(CarBuilderFull builder){
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        return builder.getCar();
    }
}

