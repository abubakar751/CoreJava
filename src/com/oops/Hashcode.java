package com.oops;


public class Hashcode {
    int age ;
    String name ;
    Hashcode(int age,String name){
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return  "age  "+age +" name "+name;
    }

   void m(){
        System.out.println( +   name.hashCode());
   }

    public static void main(String[] args) {
  Hashcode  hashcode=   new  Hashcode(21,"Abu Bakar");

        System.out.println(hashcode.toString());
       hashcode.m();

    }

        }

