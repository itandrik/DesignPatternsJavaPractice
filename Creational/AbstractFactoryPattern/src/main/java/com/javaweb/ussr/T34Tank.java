package com.javaweb.ussr;

import com.javaweb.Tank;


public class T34Tank extends Tank {
    private static final String NAME = "T - 34";
    private static final String COUNTRY = "USSR";

    @Override
    public String getDescription() {
        return NAME + COUNTRY;
    }
}
