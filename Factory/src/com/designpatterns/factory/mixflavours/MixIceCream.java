package com.designpatterns.factory.mixflavours;

import com.designpatterns.factory.flavours.Chocolate;
import com.designpatterns.factory.flavours.Mint;
import com.designpatterns.factory.flavours.Vanila;

public class MixIceCream extends IceCream {
    @Override
    protected void mixFlavours() {
        flavours.add(new Vanila());
        flavours.add(new Mint());
        flavours.add(new Chocolate());
    }
}
