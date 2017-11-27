package com.tzy.thirddemo;

public class MyRectangle {
	private int xUp;
	private int yUp;
	private int xDown;
	private int yDown;
	public MyRectangle() {
		super();
	}
	public MyRectangle(int a,int b, int c,int d) {
		xUp=a;
		yUp=b;
		xDown=c;
		yDown=d;
	}
	int getW() {
		return xDown-xUp;	
	}
	int getH() {
		return yUp-yDown;
	}
	int area() {
		return (xDown-xUp)*(yUp-yDown);
	}
	@Override
	public String toString() {
		return "MyRectangle [getW()=" + getW() + ", getH()=" + getH() + ", area()=" + area() + "]";
	}
	public static void main(String[] args) {
		MyRectangle x =new MyRectangle(1,8,5,3);
		System.out.println(x.toString());
	}
}
