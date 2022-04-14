package com.learning.impelment.interface1;

import com.learning.interface1.MyInterface1;
import com.learning.interface1.MyInterface2;

public class Implementation implements MyInterface1, MyInterface2 {
    @Override
    public void method1() {

    }
//if we do not override this method compilation error will come because diamond problem.
    @Override
    public void method2() {
        MyInterface1.super.method2();
    }
}
