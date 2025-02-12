package com.logicalProgram;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int temp=0;
        int[] l={5,2,7,3,7,3,2,4};
        for (int i=0;i< l.length;i++ ){
            for (int j = 1; j <l.length ; j++) {
                if (l[i]<l[j]){
                    temp=l[i];
                    l[i]=l[j];
                    l[j]=temp;
                }
            }
        }
        System.out.println(temp);
    }
}
