package com.designpatterns.prototype;

import com.designpatterns.prototype.phonetype.*;

public class Application {
    public static void main(String[] args) {

        Registry registry=new Registry();

        Samsung samsung= (Samsung) registry.getBrand(PhoneBrand.SAMSUNG);
        System.out.println(samsung);

        samsung.setSamsungModel("W20");
        System.out.println(samsung);

        Samsung samsung1= (Samsung) registry.getBrand(PhoneBrand.SAMSUNG);
        System.out.println(samsung1);


        Nokia nokia= (Nokia) registry.getBrand(PhoneBrand.NOKIA);
        System.out.println(nokia);



    }
}
