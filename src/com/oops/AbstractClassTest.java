package com.oops;
  abstract  class Test4{
      int show (){
          System.out.println("Hello");
          return 2;
     }
   abstract  int display();

 }
public class AbstractClassTest  extends  Test4{
    @Override
    int display() {
        return 3;
    }
    public static void main(String[] args) {
        AbstractClassTest abstractClassTest = new AbstractClassTest();
        System.out.println(abstractClassTest.display());
    }


}
