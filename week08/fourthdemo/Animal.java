package com.tzy.fourthdemo;

public class Animal {
	private String aniName;
	private int aniAge;
	private int aniWeight;
	public Animal() {
		super();
	}
	public Animal(String name,int age,int weight) {
		this.aniAge=age;
		this.aniName=name;
		this.aniWeight=weight;
	}
	void anisay() {
		System.out.println("I can say.");
	}
	void anieat() {
		System.out.println("I can eat.");
	}
	@Override
	public String toString() {
		return "Animal [aniName=" + aniName + ", aniAge=" + aniAge + ", aniWeight=" + aniWeight + "]";
	}
	public static void main(String[] args) {
		Animal an =new Animal("mingming",5,18);
		System.out.println(an.toString());
	}
}
