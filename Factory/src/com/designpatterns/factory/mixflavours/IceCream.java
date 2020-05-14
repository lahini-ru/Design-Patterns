package com.designpatterns.factory.mixflavours;

import com.designpatterns.factory.flavours.Flavour;

import java.util.ArrayList;
import java.util.List;

public abstract class IceCream {

    protected List<Flavour> flavours=new ArrayList<>();

    public IceCream(){
        mixFlavours();
    }

    protected abstract void mixFlavours();

    @Override
    public String toString() {
        return "IceCream{" +
                "flavours=" + flavours +
                '}';
    }

}
