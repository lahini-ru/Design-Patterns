package com.designpatterns.chaineofresponsibility.handlers;

import com.designpatterns.chaineofresponsibility.Cash;
import com.designpatterns.chaineofresponsibility.Handler;

public class Notes extends Handler {
    @Override
    public int returnCash(Cash cash) {
        return successor.returnCash(cash);
    }
}
