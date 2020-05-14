package com.designpatterns.factory.mixflavours;

import com.designpatterns.factory.flavours.Chocolate;
import com.designpatterns.factory.flavours.Vanila;

public class ChocoVanilaIceCream extends IceCream {
    @Override
    protected void mixFlavours() {
        flavours.add(new Chocolate());
        flavours.add(new Vanila());
    }
}
