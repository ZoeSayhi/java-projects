package com.tzy.seconddemo;

public class Computer {
	private int CountValue;
	public int getCountValue() {
		return CountValue;
	}
	public void setCountValue(int countValue) {
		CountValue = countValue;
	}
	public Computer() {
		super();
	}
	public Computer (int a){
		CountValue=a;
	}
	void increment() {
		CountValue++;
	}
	void decrement() {
		CountValue--;
	}
	void reset() {
		CountValue=0;
	}
	public static void main(String[] args) {
		Computer a =new Computer(10);
		for(int i=0;i<3;i++){
			a.increment();
		}
	    System.out.println(a.CountValue);
		a.decrement();
		System.out.println(a.CountValue);
		a.reset();
		System.out.println(a.CountValue);
	}
}
