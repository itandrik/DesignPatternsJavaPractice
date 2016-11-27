package com.javaweb;

/**
 * Start point of program. This class demonstrates
 * our flyweight pattern.
 *
 * @author Andrii Chernysh
 * @version 1.0 , 27 Nov 2016
 */
public class FlyWeightPatternMain {
    public static void main( String[] args ) {
        FlyWeightFactory flyWeightFactory = FlyWeightFactory.getInstance();
        for (int i = 0; i < 5; i++) {
            FlyWeight flyWeightAdder = flyWeightFactory.getFlyWeight("add");
            flyWeightAdder.doMath(i,i);

            FlyWeight flyweightMultiplier = flyWeightFactory.getFlyWeight("multiply");
            flyweightMultiplier.doMath(i, i);
        }
    }
}
