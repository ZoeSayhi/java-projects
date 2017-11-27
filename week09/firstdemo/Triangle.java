package com.tzy.firstdemo;

public class Triangle {
	float side1;
	float side2;
	float side3;
	public Triangle() {
		super();
	}
	public Triangle(float a,float b,float c){
		side1=a;
		side2=b;
		side3=c;
	}
	public float getSide1() {
		return side1;
	}
	public void setSide1(float side1) {
		this.side1 = side1;
	}
	public float getSide2() {
		return side2;
	}
	public void setSide2(float side2) {
		this.side2 = side2;
	}
	public float getSide3() {
		return side3;
	}
	public void setSide3(float side3) {
		this.side3 = side3;
	}
	public float getArea(){
		float c=0;
		c=(side1+side2+side3)/2;
		return (float) Math.sqrt(c*(c-side1)*(c-side2)*(c-side3));
	}
	public float getPerimeter(){
		return side1+side2+side3;
	}
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	public static void main(String[] args) {
		Triangle t =new Triangle ();
		t.setSide1(3);
		t.setSide2(4);
		t.setSide3(5);
		System.out.println(t.toString());
		System.out.println("Area"+t.getArea()+" "+"÷‹≥§"+t.getPerimeter());
	}
}
