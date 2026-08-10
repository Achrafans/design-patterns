package net.achraf.impl;

import net.achraf.ICafe;

public class LaitDecorator extends CafeDecorator {
    public LaitDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public double cout() {
        return cafeDecore.cout() + 0.5;
    }

    @Override
    public String description() {
        return cafeDecore.description() + ", au lait";
    }
}
