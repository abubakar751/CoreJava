package com.array;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        int arr[]={2,3,6,4,9,8,7,56,8,9,45};//56,45,2234567890
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                }
            }
        }
        System.out.println("second hieghest number "+arr[1]);
    }
}
