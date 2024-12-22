package com.basic;

public class BreakStmt {
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==6) {

                break;
            }
         System.out.println(i);
    }}
}
