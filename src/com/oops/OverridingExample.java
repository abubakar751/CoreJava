package com.oops;
class Override{
	public void hello() {
		System.out.println("Hello ...");
	}
}
public class OverridingExample extends Override {
	public void hello() {
		System.out.println("Hello 1111");
	}
	public static void main(String[] args) {
		Override example = new OverridingExample();
example.hello();
example.hello();
	}

}
