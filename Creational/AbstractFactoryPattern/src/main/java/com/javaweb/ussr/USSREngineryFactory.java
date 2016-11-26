package com.javaweb.ussr;

import com.javaweb.Aircraft;
import com.javaweb.EngineryFactory;
import com.javaweb.Tank;


public class USSREngineryFactory implements EngineryFactory {
    @Override
    public Tank createTank() {
        return new T34Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new Il2Aircraft();
    }
}
