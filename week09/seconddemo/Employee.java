package com.tzy.seconddemo;

public class Employee extends Person {
	String office;
	float salary;
	int[] date =new int[8];
	public String Employee(){
		return("�ź�");
	}
	public String toString() {
		return "Employee [name=" + super.Person() +",]";
	}
}