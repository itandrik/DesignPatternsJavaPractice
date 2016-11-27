package com.javaweb;

/**
 * The FlyweightMultiplier class is similar to
 * the FlyweightAdder class, except that it
 * performs multiplication rather than addition.
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class FlyWeightMultiplier implements FlyWeight {
    String operation;

    public FlyWeightMultiplier() {
        operation = "multiply";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
    }
}
