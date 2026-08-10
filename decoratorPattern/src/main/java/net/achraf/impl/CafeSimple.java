package net.achraf.impl;

import net.achraf.ICafe;

public class CafeSimple implements ICafe {
    @Override
    public double cout() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Café simple";
    }
}
