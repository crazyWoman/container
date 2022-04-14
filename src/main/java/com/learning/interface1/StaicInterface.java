package com.learning.interface1;

public interface StaicInterface {

    default void print(String str) {
        if (!isNull(str))
            System.out.println("StaicInterface Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("StaicInterface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
