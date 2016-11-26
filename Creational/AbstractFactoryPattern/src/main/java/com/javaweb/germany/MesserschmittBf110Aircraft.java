package com.javaweb.germany;

import com.javaweb.Aircraft;


public class MesserschmittBf110Aircraft extends Aircraft {
    private static final String NAME = "Messerschmitt Bf.110";
    private static final String COUNTRY = "Germany";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
