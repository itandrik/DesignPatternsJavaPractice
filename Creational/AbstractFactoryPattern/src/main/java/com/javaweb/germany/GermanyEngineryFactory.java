package com.javaweb.germany;

import com.javaweb.Aircraft;
import com.javaweb.EngineryFactory;
import com.javaweb.Tank;


public class GermanyEngineryFactory implements EngineryFactory {
    @Override
    public Tank createTank() {
        return new TigerTank();
    }

    @Override
    public Aircraft createAircraft() {
        return new MesserschmittBf110Aircraft();
    }
}