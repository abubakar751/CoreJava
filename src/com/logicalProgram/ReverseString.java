package com.logicalProgram;

public class ReverseString {
    public static void main(String[] args) {
        String string="Hello";
        for (int i=string.length()-1;i>=0;i--){
            char c = string.charAt(i);
            System.out.print(c);
        }
    }
}
