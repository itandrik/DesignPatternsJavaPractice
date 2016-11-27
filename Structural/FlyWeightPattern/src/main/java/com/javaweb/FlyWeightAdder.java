package com.javaweb;

/**
 * The FlyweightAdder class is a concrete flyweight class.
 * It contains an "operation" field that is used to store
 * the name of an operation that is common to adder flyweights.
 * Notice the call to Thread.sleep(3000). This simulates a
 * construction process that is expensive in terms of time.
 * Each FlyweightAdder object that is created takes 3 seconds to create,
 * so we definitely want to minimize the number of flyweight
 * objects that are created. The doMath() method is implemented.
 * It displays the common "operation" field and displays the addition
 * of a and b, which are external state values that are passed in and
 * used by the FlyweightAdder when doMath() is executed.
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class FlyWeightAdder implements FlyWeight {
    String operation;

    public FlyWeightAdder(){
        operation = "adding";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
    }
}
