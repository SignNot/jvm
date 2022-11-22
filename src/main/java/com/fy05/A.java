package com.fy05;

public class A {
    int a=10;
    {
        a=30;
        System.out.println(1);
        System.out.println(2);
    }
    A(){
        a=20;
    }

}
