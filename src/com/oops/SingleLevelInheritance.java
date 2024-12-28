package com.oops;
class Parent {
    public int multi(int a ,int b){
        return a*b;
    }
}
public class SingleLevelInheritance  extends Parent{
    public static void main(String[] args) {

        SingleLevelInheritance singleLevelInheritance = new SingleLevelInheritance();
        int multi = singleLevelInheritance.multi(10, 40);
        System.out.println(multi);
    }

}
