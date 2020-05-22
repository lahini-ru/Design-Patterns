package com.designpatterns.memento;

public class Application {

    public static void main(String[] args) {

        AddingCalculator addingCalculator=new AddingCalculator();
        CareTaker careTaker=new CareTaker();

        addingCalculator.addNumber(new Number(50));
        addingCalculator.addNumber(new Number(42));
        careTaker.add(addingCalculator);
        System.out.println(addingCalculator);

        addingCalculator.addNumber(new Number(35));
        //careTaker.add(addingCalculator);
        System.out.println(addingCalculator);

        addingCalculator.addNumber(new Number(60));
        careTaker.add(addingCalculator);
        System.out.println(addingCalculator);

        addingCalculator.addNumber(new Number(10));
        addingCalculator.addNumber(new Number(8));
        //careTaker.add(addingCalculator);
        System.out.println(addingCalculator);

        careTaker.undo(addingCalculator);
        System.out.println(addingCalculator);

        careTaker.undo(addingCalculator);
        System.out.println(addingCalculator);

        careTaker.undo(addingCalculator);
        System.out.println(addingCalculator);

    }

}
