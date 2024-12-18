package com.array;

public class FindMinNumberUsingArray {
    public static void main(String[] args) {
        int arr []={2,5,2,1,8};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (min<arr[j]){}
            }
        }
    }
}
