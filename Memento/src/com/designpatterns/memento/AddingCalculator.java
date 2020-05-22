package com.designpatterns.memento;

import java.util.ArrayList;

//originator
public class AddingCalculator {

    ArrayList<Number> numbers=new ArrayList<>();

    public void addNumber(Number number){
        numbers.add(number);
    }

    public ArrayList<Number> getNumbers() {
        return (ArrayList<Number>)numbers.clone();
    }

    public NumberMemento add(){

        return new NumberMemento(getNumbers());

    }

    public void undo(NumberMemento numberMemento){

        numbers=numberMemento.getNumbers();
    }

    @Override
    public String toString() {
        return "AddingCalculator{" +
                "numbers=" + numbers +
                '}';
    }

    static class NumberMemento{
        ArrayList<Number> numbers=new ArrayList<>();

        public NumberMemento(ArrayList<Number> numbers) {
            this.numbers = numbers;
        }

        private ArrayList<Number> getNumbers() {
            return numbers;
        }
    }
}
