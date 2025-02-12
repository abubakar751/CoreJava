package com.logicalProgram;

public class PrimeNumber {

        public static void main(String[] args) {
            int number=11;
           for (int j=1;j<=number;j++){
               int  temp=0;
            for (int i=2;i<j;i++){
                if (j%i==0){
                   temp=temp+1;
                   break;
                }
            }
            if (temp==0){
                System.out.println(j+" Is Prime Number");
        }}}
}
