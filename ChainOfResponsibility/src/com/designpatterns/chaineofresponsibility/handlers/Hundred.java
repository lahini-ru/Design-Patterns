package com.designpatterns.chaineofresponsibility.handlers;

import com.designpatterns.chaineofresponsibility.Cash;
import com.designpatterns.chaineofresponsibility.Handler;

public class Hundred extends Handler {


    @Override
    public int returnCash(Cash cash) {
        if((cash.getAmount()/100)>0) {
            cash.setNumOfNotes((int) (cash.getAmount() / 100));
            System.out.println((cash.getAmount() / 100) + " ,Hundred Rupees notes are Fetched");
            if ((cash.getAmount() % 100) == 0){
                return cash.getNumOfNotes();
            }
            else{
                long newAmount=cash.getAmount()%100;
                cash.setAmount(newAmount);
                return successor.returnCash(cash);
            }

        }
        else
            return successor.returnCash(cash);


    }
}
