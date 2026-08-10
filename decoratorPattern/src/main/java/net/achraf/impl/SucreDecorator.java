package net.achraf.impl;

import net.achraf.ICafe;

public class SucreDecorator extends CafeDecorator{
    public SucreDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public double cout() {
        return cafeDecore.cout() + 0.2;
    }

    @Override
    public String description() {
        return cafeDecore.description() + ", sucré";
    }
}
