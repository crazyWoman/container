package com.learning.functional.interfaceDemo;

import com.sun.security.jgss.GSSUtil;

public class SquareTest {
    public static void main(String[] args) {
        int a = 5;
        Square square = (x)->x*x;
        int area = square.calculate(5);
        System.out.println(area);
    }
}
