package com.designpatterns.singleton;

public class Application {

    public static void main(String[] args) {

        long startTime, endTime;

        startTime=System.currentTimeMillis();
        UserLog userLogInstance1=UserLog.getUserLog();
        endTime=System.currentTimeMillis();

        System.out.println(userLogInstance1);
        System.out.println(endTime-startTime);

        startTime=System.currentTimeMillis();
        UserLog userLogInstance2=UserLog.getUserLog();
        endTime=System.currentTimeMillis();

        System.out.println(userLogInstance2);
        System.out.println(endTime-startTime);

    }
}
