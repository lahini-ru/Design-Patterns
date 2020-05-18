package com.designpatterns.chaineofresponsibility;

import com.designpatterns.chaineofresponsibility.handlers.*;

public class Application {

    public static void main(String[] args) {

        Notes notes=new Notes();
        Hundred hundred=new Hundred();
        FiveHundred fiveHundred=new FiveHundred();
        Thousand thousand=new Thousand();
        FiveThousand fiveThousand=new FiveThousand();

        notes.setSuccessor(fiveThousand);
        fiveThousand.setSuccessor(thousand);
        thousand.setSuccessor(fiveHundred);
        fiveHundred.setSuccessor(hundred);

        Cash cash1=new Cash(200);
        System.out.println(notes.returnCash(cash1));
        System.out.println("**********************************************************");

        Cash cash2=new Cash(800);
        System.out.println(notes.returnCash(cash2));
        System.out.println("**********************************************************");

        Cash cash3=new Cash(2200);
        System.out.println(notes.returnCash(cash3));
        System.out.println("**********************************************************");

        Cash cash4=new Cash(7800);
        System.out.println(notes.returnCash(cash4));

    }
}
