package com.designpatterns.builder;

public class Application {

    public static void main(String[] args) {

        Burger.Builder builder=new Burger.Builder("Whole Wheat");

        Burger burger=builder.cheese("American").dressing("chili").build();

        System.out.println(burger);
    }

}
