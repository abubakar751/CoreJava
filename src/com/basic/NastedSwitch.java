package com.basic;

public class NastedSwitch {
    public static void main(String[] args) {

     String course="bca";
    int finalYear=24;
    switch(course){
    case "bsc":
        System.out.println("Bcs Pass out Student");
        break;
        case  "ba":
            switch (finalYear){
                case 20:
                    System.out.println(" ba student final  years 20");
                    break;
                case 22:
                    System.out.println("ba student final years  22");
                    break;
                case 23:
                    System.out.println(" ba student final years 23");
                    break;
                case 24:
                    System.out.println(" ba student final years 24");
                    break;
            }
        case "bca":
            switch (finalYear){
                case 20:
                    System.out.println(" bca student final  years 20");
                    break;
                case 22:
                    System.out.println("bca student final years  22");
                    break;
                case 23:
                    System.out.println(" bca student final years 23");
                    break;
                case 24:
                    System.out.println(" bca student final years 24");
                    break;
            }



}
        }
        }
