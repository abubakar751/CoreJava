package com.array;

public class MinNumberExample {
    public static void main(String[] args) {
      int  arr[]={8,6,9,2, 5,4};
      int min=arr[0];
      for (int i=1;i<arr.length;i++){
          if (arr[i]<min){
              min=arr[i];
          }
      }
      System.out.println(min);
      }
    }

