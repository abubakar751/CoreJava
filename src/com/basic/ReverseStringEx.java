package com.basic;

public class ReverseStringEx {
    public static void main(String[] args) {
        String s = "Hello World";
         char []chars = s.toCharArray();
         for (int i=chars.length-1;i>=0;i--){
             System.out.println(chars[i]);

         }
    }
}
