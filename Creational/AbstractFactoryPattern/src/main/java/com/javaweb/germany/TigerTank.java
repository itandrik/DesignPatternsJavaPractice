package com.javaweb.germany;

import com.javaweb.Tank;


public class TigerTank extends Tank {
    private static final String NAME = "Tiger";
    private static final String COUNTRY = "Germany";

    @Override
    public String getDescription() {
        return NAME + COUNTRY;
    }
}
