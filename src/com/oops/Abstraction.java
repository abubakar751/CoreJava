package com.oops;
abstract class Abstract{
    String write(){
        System.out.println("Writing");
        return  "Hello";
    }
  abstract String read();
}
public class Abstraction extends Abstract {
    public String read(){
        System.out.println("Reading");
        return "Hii";
    }
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.write();
         abstraction.read();
    }

}
