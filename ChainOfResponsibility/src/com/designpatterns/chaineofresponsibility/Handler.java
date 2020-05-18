package com.designpatterns.chaineofresponsibility;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract int returnCash(Cash cash);
}
