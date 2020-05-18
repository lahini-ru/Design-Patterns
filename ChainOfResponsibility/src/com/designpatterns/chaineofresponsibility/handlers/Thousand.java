package com.designpatterns.chaineofresponsibility.handlers;

import com.designpatterns.chaineofresponsibility.Cash;
import com.designpatterns.chaineofresponsibility.Handler;

public class Thousand extends Handler {


    @Override
    public int returnCash(Cash cash) {
        if((cash.getAmount()/1000)>0) {
            cash.setNumOfNotes((int) (cash.getAmount() / 1000));
            System.out.println((cash.getAmount() / 1000) + " ,Thousand Rupees notes are Fetched");
            if ((cash.getAmount() % 1000) == 0){
                return cash.getNumOfNotes();
            }
            else{
                long newAmount=cash.getAmount()%1000;
                cash.setAmount(newAmount);
                return successor.returnCash(cash);
            }

        }
        else
            return successor.returnCash(cash);


    }
}
