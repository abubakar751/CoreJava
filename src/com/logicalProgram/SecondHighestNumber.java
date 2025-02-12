package com.logicalProgram;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int temp=0;
        int arr[]={7,4,3,2,9,2,3};
        for (int i = 0; i < arr.length  ; i++) {
            for (int j =i+1 ; j < arr.length ; j++) {
                if (arr[j]>arr[i]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
