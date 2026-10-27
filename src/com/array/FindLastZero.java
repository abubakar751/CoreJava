package com.array;

public class FindLastZero {

	public static void main(String[] args) {
		;
		int d=0;
		int temp = 0;
		int a[]= {4,5,6,0,0,7,8,9,0};
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) {
				a[d]=a[i];
				temp =a[d];
				a[i]=a[d];
				a[i]=temp;
				d++;
				
				System.out.println(a[i]);
			}
			
			
			
		}
	}

}
