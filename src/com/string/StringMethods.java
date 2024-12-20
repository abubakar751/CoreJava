package com.string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String string = "Hello Center ";
        String[] es = string.split("e",4);
        String string1="World";
        String string2="Abubakar";
       string.join(string1);
        System.out.println(string.charAt(1));// charAt()
        System.out.println(string.length());  //length()
        System.out.println(string.format( "My name is  %s and i'm %d years old ","AbuBakar",20)); // format() method we can change  String value by %d for int %f for .....
        System.out.println(string.substring(1,3)); //substring it finds middle value
        System.out.println(string.contains(" "));// it findings  which i insert in brackets if present return true otherwise return false
        System.out.println(String.join("",string,string1)); // it joins two String "" it works between both String
        System.out.println(string.equals(string1)); // it will check equality of a string
        System.out.println(string2.isEmpty()); //it should be "" same as otherwise it returns false
        System.out.println(string.concat(string1)); // it will join both  it returns String HelloWorld
        System.out.println(string2.replace("a","e"));//it will replace from e in place of a
        System.out.println(string.equalsIgnoreCase(string1));
        System.out.println(Arrays.toString(es));
        System.out.println(string.intern());

        System.out.println(string.indexOf("l"));
        System.out.println(string.indexOf("o",3));
        System.out.println(string.valueOf("ads"));

    }
}
