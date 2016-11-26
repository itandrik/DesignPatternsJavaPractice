package com.javaweb;

import com.javaweb.germany.GermanyEngineryFactory;
import com.javaweb.ussr.USSREngineryFactory;

/**
 * Abstract factory pattern. Sample uses enginery
 * of USSR and Germany
 *
 * @author Andrii Chernysh
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        EngineryFactory factory = new USSREngineryFactory();
        System.out.println("USSR enginery : ");
        showEnginery(factory);

        factory = new GermanyEngineryFactory();
        System.out.println("Germany eninery : ");
        showEnginery(factory);
    }

    public static void showEnginery(EngineryFactory engineryFactory) {
        Tank tank = engineryFactory.createTank();
        System.out.println(tank.getDescription());

        Aircraft aircraft = engineryFactory.createAircraft();
        System.out.println(aircraft.getDescription());
    }
}
