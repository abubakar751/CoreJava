package com.logicalProgram;

public class Fibonocci
{
    public static void main(String[] args) {
        int num=10;
        int a=0;
        int b=1;
        System.out.println(a+" "+b);
        for (int i=2;i<10;i++){
            int next =a+b;
            System.out.println(next);
            a=b;
            b=next;
        }

    }
}
