package com.basic;

public class PrimeNumberTest {
    public static void main(String[] args) {
        int a=11;
        int temp=0;
        for (int i=2;i<a;i++){
            if (a%i==0){
                temp=temp+1;
            }
        }
        if (temp==0){
            System.out.println("prime number");
        }
    }
}
