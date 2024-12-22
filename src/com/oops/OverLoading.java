package com.oops;

public class OverLoading {
    void m(){
        System.out.println("m method");
    }
    void m2(int a ){
        System.out.println("m2 method");
    }
    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        overLoading.m2(2);
    }
}
