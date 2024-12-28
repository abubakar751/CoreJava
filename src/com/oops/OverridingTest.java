package com.oops;
interface A{
    int add(int a ,int b);
}
public class OverridingTest implements A {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        OverridingTest overridingTest = new OverridingTest();
        int add = overridingTest.add(10, 10);
        System.out.println(add);
    }
}
