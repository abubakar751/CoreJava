package com.oops;

public class OverloadingExample {
    int add(int a,int b){
        return a+b;

    }
 private   int  add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();

        System.out.println(overloadingExample.add(10,20)); ;
        int add2=  overloadingExample.add(10,20,30);
        System.out.println(add2);
       /* System.out.println(add);
        System.out.println(add2);*/

    }
}
