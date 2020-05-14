package com.designpatterns.singleton;

public class UserLog {

    private static volatile UserLog userLog;//=new UserLog();

    private UserLog(){
        if(userLog!=null){
            throw new RuntimeException("Exception occurred. Use getUserLog method");
        }

    }

    public static synchronized UserLog getUserLog(){
        if(userLog==null){
            userLog=new UserLog();

        }
        return userLog;
    }
}
