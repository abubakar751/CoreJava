package com.array;


public class MultiLevelArray {

	public static void main(String[] args) {
		int a[][]= {{4,5,6,7,8,9,0},{3,4,5,6,7}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
