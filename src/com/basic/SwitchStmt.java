package com.basic;

public class SwitchStmt {
    public static void main(String[] args) {
        int a = 20;
        switch (a) {

            case 1:
                System.out.println(" Hello case 1");
                break;
            case 5:
                System.out.println(" Hello case 5");
                break;
            case 10:
                System.out.println(" Hello case 10");
                break;
            case 20:
                System.out.println(" Hello case 20");
                break;
            case 21:
                System.out.println(" Hello case 21");
                break;
            default:
                System.out.println("not found ");
        }
    }
}
