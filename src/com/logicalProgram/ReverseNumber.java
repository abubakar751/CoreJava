package com.logicalProgram;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=121;
        int dev=num;
        int mul=0,rem;
        while(dev!=0){
            rem=dev%10;
            mul=mul*10+rem;
            dev=dev/10;
        }
        System.out.println(mul);
        if (num==mul){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }
    }
}
