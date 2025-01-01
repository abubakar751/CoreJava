package com.string;

public class SplitMethod {
    public static void main(String[] args) {
        String string = "AbuBakar";
        String[] split = string.split("(?=B)");
        for (int i = 0; i <split.length ; i++) {
            System.out.print(split[i]);
        }

    }
}
