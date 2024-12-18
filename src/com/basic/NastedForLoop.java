package com.basic;

public class NastedForLoop {
    public static void main(String[] args) {
        a:
        for(int i=1;i<5;i++){
            b:
            for (int j=0;j<=5;j++){
                if (i==2 && j==2){
                    break a;

                }
                System.out.println(i+" "+j);
            }
        }
    }
}
