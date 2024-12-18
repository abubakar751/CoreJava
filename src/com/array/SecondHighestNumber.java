package com.array;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int temp;
        int arr[] = {4, 1, 7, 6, 5, 5, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    temp = arr[i];
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            

        System.out.println(arr[i]);}
    }

}
