package com.tzy.seconddemo;

public class Person {
	String name;
	String address;
	int []phone=new int [13];
	String email;
	public Person() {
		super();
	}
	public String Person(){
		return("小小");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "person[name=" + this.name +",]";
	}
	/*public static void main(String[] args) {
		Person p=new Person();
		p.setName("明明");
	}*/
}
