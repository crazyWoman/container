package com.learning.impelment.interface1;

import com.learning.interface1.StaicInterface;

public class StaticImplementaion2 implements StaicInterface {
    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        StaticImplementaion2 obj = new StaticImplementaion2();
        obj.print("");
        obj.isNull("abc");
    }
}
