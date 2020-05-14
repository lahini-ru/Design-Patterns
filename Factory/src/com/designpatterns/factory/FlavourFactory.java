package com.designpatterns.factory;

import com.designpatterns.factory.mixflavours.*;

public class FlavourFactory {

    public static IceCream mixFlavours(FlavourType flavourType){
        switch (flavourType){
            case VANILA:
                return new VanilaIceCream();
            case CHOCOVANILA:
                return new ChocoVanilaIceCream();
            case CHOCOMINT:
                return new ChocoMintIceCream();
            case MIX:
                return new MixIceCream();
            default:
                return null;
        }
    }
}
