package com.designpatterns.chaineofresponsibility.handlers;

import com.designpatterns.chaineofresponsibility.Cash;
import com.designpatterns.chaineofresponsibility.Handler;

public class FiveThousand extends Handler {


    @Override
    public int returnCash(Cash cash) {
        if((cash.getAmount()/5000)>0) {
            cash.setNumOfNotes((int) (cash.getAmount() / 5000));
            System.out.println((cash.getAmount() / 5000) + " ,Five Thousand Rupees notes are Fetched");

            if ((cash.getAmount() % 5000) == 0){
                return cash.getNumOfNotes();
            }
            else{
                long newAmount=cash.getAmount()%5000;
                cash.setAmount(newAmount);
                return successor.returnCash(cash);
            }

        }
        else
            return successor.returnCash(cash);


    }
}
