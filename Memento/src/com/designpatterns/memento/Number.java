package com.designpatterns.memento;

public class Number {

    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
