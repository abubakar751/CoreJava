package com.basic;

public class ReverseString {
    public static void main(String[] args) {
        String s = "raka BubA";
        char c[]=s.toCharArray();
        for (int i=c.length-1;i>=0;i--){
            System.out.println(c[i]);
        }
    }
}
