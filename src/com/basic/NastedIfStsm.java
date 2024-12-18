package com.basic;

public class NastedIfStsm {
    public static void main(String[] args) {
        int age = 20;
        int weight = 55;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("you're eligible");
            } else {
                System.out.println("weight must be 55");
            }
        } else {
            System.out.println("age must be 18 or 18+");
        }
    }
}
