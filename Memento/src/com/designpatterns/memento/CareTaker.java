package com.designpatterns.memento;

import java.util.Stack;

public class CareTaker {

    Stack<AddingCalculator.NumberMemento> history=new Stack<>();

    public void add(AddingCalculator addingCalculator){
        history.push(addingCalculator.add());
    }

    public void undo(AddingCalculator addingCalculator){
        if(!history.isEmpty())
            addingCalculator.undo(history.pop());

        else
            System.out.println("No more numbers to undo");

    }
}
