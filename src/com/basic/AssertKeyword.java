package com.basic;

public class AssertKeyword {
    static int  x;

    public static void main(String[] args) {
        int number = -5;
        assert number >= 0 : "Number must be non-negative, but got " + number;

        System.out.println("Program continues here...");
        AssertKeyword assertKeyword = new AssertKeyword();
        assertKeyword.m2();

    }
    void m2(){
        System.out.println(x);
    }
}


