package com.basic;

public class PrimeNumberEx {
    public static void main(String[] args) {
        int number=97;
        int temp=0;
        for (int i=2;i<number;i++){
            if (number%i==0){
                temp=temp+1;
            }
        }
        if (temp==0){
            System.out.println(number+" is PrimeNumber ");
        }
        else {
            System.out.println(number+" is not PrimeNumber ");
        }
    }
}
