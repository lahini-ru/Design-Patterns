package com.designpatterns.factory.mixflavours;

import com.designpatterns.factory.flavours.Chocolate;
import com.designpatterns.factory.flavours.Mint;

public class ChocoMintIceCream extends IceCream {
    @Override
    protected void mixFlavours() {
        flavours.add(new Chocolate());
        flavours.add(new Mint());
    }
}
