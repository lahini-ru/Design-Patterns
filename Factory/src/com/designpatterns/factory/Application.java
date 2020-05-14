package com.designpatterns.factory;

import com.designpatterns.factory.mixflavours.FlavourType;
import com.designpatterns.factory.mixflavours.IceCream;

public class Application {
    public static void main(String[] args) {

        IceCream iceCream1=FlavourFactory.mixFlavours(FlavourType.CHOCOMINT);
        System.out.println(iceCream1);

        IceCream iceCream2=FlavourFactory.mixFlavours(FlavourType.CHOCOVANILA);
        System.out.println(iceCream2);

        IceCream iceCream3=FlavourFactory.mixFlavours(FlavourType.MIX);
        System.out.println(iceCream3);

    }
}
