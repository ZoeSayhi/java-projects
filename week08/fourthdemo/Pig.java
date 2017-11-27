package com.tzy.fourthdemo;

public class Pig extends Animal{
	protected String pigName;
	protected int pigAge;
	protected int pigWeight;
	void anisay() {
		System.out.println("I want to sleep.");
	}
	void anieat() {
		System.out.println("I eat pork.");
	}
	void paokeng() {
		System.out.println("I can paokeng");
	}
	public Pig(String name,int age,int weight) {
		super(name,age,9);
		this.pigAge=age;
		this.pigName=name;
		this.pigWeight=weight;
		System.out.println(super.toString());
		
	}
	@Override
	public String toString() {
		return "Pig [pigName=" + pigName + ", pigAge=" + pigAge + ", pigWeight=" + pigWeight + "]";
	}
	public static void main(String[] args) {
		Pig p = new Pig("honghong",8,20);
		System.out.println(p.toString());
	}
}
