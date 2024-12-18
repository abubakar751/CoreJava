package com.array;

public class MinNumber {
    public static void main(String[] args) {
        int arr[]={3,2,1,3,2};
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
          min=arr[i];
            }
        }
        System.out.println(min);
    }
}
