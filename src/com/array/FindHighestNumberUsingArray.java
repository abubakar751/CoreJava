    package com.array;

    public class FindHighestNumberUsingArray {
        public static void main(String[] args) {
            int a[]={4,3,2,8,21,1};
            int hi=a[0];
            for (int i=0;i<a.length;i++){
                for (int j=i+1;j<a.length;j++){
                    if (a[j]>hi){
                      hi=a[j];
                    }
                }
            }
            System.out.println(hi);

        }
    }
