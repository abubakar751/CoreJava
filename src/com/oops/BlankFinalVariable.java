package com.oops;

public class BlankFinalVariable {
   final int nummer;
    BlankFinalVariable( int value){
        nummer = value;
        System.out.println(nummer);
    }


     
    public static void main(String[] args) {
       new BlankFinalVariable(3);
       new BlankFinalVariable(2);

    }
}
