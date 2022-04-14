package com.learning.interface1;

public interface MyInterface2 {
    void method1();

    default void method2(){
        System.out.println("Rohan ........");
    }
}
