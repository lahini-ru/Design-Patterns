package com.designpatterns.chaineofresponsibility;

public class Cash {

    private int numOfNotes;
    private static long amount;

    public void setNumOfNotes(int numOfNotes) {
        this.numOfNotes = numOfNotes;
    }

    public Cash(long amount) {
        this.amount = amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public int getNumOfNotes() {
        return numOfNotes;
    }

}
