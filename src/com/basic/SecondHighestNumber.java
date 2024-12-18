package com.basic;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int arr[]={9,14,8,4,7,7,54};
        int high=0;
        for (int i=0;i<=arr.length;i++){
            for (int j=i+1;j<=i;j++){
        
                j=i;
                i=high;
                high=j;

            }
        }
        System.out.println(high);
    }
}
