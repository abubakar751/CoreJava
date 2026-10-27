package com.oops;

abstract class AnimalExample{
	abstract  void  animal();
	  void  animal2() {
		System.out.println("Hello aniimal2 non abtract method");
	}
} 
class Cat extends AnimalExample{


	void animal() {
System.out.println("Hello aniimal abtract method ");		
	}
	
}
public class AbstracttionExample {
	public static void main(String[] args) {
	AnimalExample cat = new Cat(); 
	cat.animal();
	cat.animal2();
	}

}
