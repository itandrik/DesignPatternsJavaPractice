package com.javaweb.ussr;

import com.javaweb.Aircraft;


public class Il2Aircraft extends Aircraft {
    private static final String NAME = "Il-2";
    private static final String COUNTRY = "USSR";

    @Override
    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
