package com.oops;
class Encap{
	private int id;
	private String name;
	private int age;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Encapsuation {

	public static void main(String[] args) {
		Encap encap = new Encap();
encap.setId(101);
encap.setName("Abu Bakar");
encap.setAge(22);
System.out.println(encap.getId());
System.out.println(encap.getName());
System.out.println(encap.getAge());
	}

}
