package com.basic;

public class StaticVariable {
      int i = 10;

    public static void main(String[] args) {
        StaticVariable s = new StaticVariable();
        s.i=20;

        StaticVariable s3 = new StaticVariable();
        s3.i=40;
        StaticVariable s2=new StaticVariable();
        System.out.println(s2.i);

    }

}

//40    static        40
//40    instance      10
