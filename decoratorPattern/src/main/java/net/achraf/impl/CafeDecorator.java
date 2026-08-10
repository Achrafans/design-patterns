package net.achraf.impl;

import net.achraf.ICafe;

abstract  class CafeDecorator implements ICafe{
    protected ICafe cafeDecore;

    public CafeDecorator(ICafe cafe) {
        this.cafeDecore = cafe;
    }
}
