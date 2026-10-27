package com.oops;

public class OverloadingTest {

	public String hello(String name) {
		
		return name;
	}
public String hello(String name,int age) {
		
		return name+age;
	}
	public static void main(String[] args) {
OverloadingTest test = new OverloadingTest ();
System.out.println(test.hello("Abu Bkar"));
System.out.println(test.hello("Abu Bkar",22));
	}

}
