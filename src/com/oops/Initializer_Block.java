package com.oops;

public class Initializer_Block {
    int a=20;

   static  {
        System.out.println("hello Initializer_Block 1 ");
    }
    Initializer_Block(){
        System.out.println("Hello Constructor2 "+a);
    }



    public static void main(String[] args) {
        System.out.println("hello static method 3");

        new Initializer_Block();

    }
}
