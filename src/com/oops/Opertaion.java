package com.oops;

public class Opertaion {

    public static void main(String[] args) {

        System.out.println(temp());
    }

    static int temp() {
        int i = 1;
        try {
            i = i + 1;
            return i;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            i = i + 3;
            System.out.println("finally");
return i;
        }



    }
}
