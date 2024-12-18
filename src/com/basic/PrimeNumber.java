package com.basic;
public class PrimeNumber {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            int temp = 0;
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println("number is prime "+number);
            }
        }
    }
}
