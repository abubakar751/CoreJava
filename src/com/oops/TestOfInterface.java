package com.oops;
interface Interface1{
    int show();
}
public class TestOfInterface implements  Interface1 {
    public static void main(String[] args) {

        TestOfInterface testOfInterface = new TestOfInterface();
        System.out.println(testOfInterface);

    }

    @Override
    public int show() {
        return 10;
    }
   //  simpleclass   --> abstarctClass -->interface -->simpleclasss
}
