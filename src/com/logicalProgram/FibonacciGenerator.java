package com.logicalProgram;

public class FibonacciGenerator {
    public static void main(String[] args) {
        int n = 10; // Set the number of terms (modify this value as needed)

        int a = 0, b = 1;

        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
