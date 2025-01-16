package com.oops;
class SimpleClass{
    public void display(){
        System.out.println("Hello Darakshan Anjum");
    }
}
interface Animal  {
int show2();
}
interface Animal2  {
    int show();
}
public class InterfaceTest2 implements Animal2{

    @Override
    public int show() {
        return 2;
    }

    @Override
    public int show2() {
        return 4;
    }

    public static void main(String[] args) {
        InterfaceTest2 inter = new InterfaceTest2();
        System.out.println(inter.show());
        System.out.println(inter.show2());
    }

}
