package com.oops;
class Test1{
    int show (){
        System.out.println("Hello");
        return  1;
    }

}
public class Test2  extends Test1{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.show();
    }
}
