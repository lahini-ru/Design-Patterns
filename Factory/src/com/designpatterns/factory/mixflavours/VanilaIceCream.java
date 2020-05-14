package com.designpatterns.factory.mixflavours;

import com.designpatterns.factory.flavours.Vanila;

public class VanilaIceCream extends IceCream {
    @Override
    protected void mixFlavours() {
        flavours.add(new Vanila());
    }
}
