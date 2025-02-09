package com.string;


public class CountSpaces {
    public static void main(String[] args) {
        int spaceCount=0;
        String string = "abu bakar done bca";
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) ==' '){

                spaceCount++;
            }
            
        }
        System.out.println(spaceCount);
    }
}


