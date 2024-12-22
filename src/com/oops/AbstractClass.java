package com.oops;
abstract class Hello{
    abstract void hello();
    void hello2(){
        System.out.println("Hello");

    }}
public class AbstractClass extends  Hello{
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.hello();

    }
    @Override
    void hello() {
        System.out.println("Hello , i'm abstract method");
    }

}
