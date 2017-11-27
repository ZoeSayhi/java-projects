package com.tzy.firstdemo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
			Triangle t =new Triangle ();
			System.out.println("输入三角形的三条边：");
			Scanner scanner =new Scanner (System.in);
			float a =scanner.nextFloat();
			float b =scanner.nextFloat();
			float c =scanner.nextFloat();
			t.setSide1(a);
			t.setSide2(b);
			t.setSide3(c);
			System.out.println(t.toString());
			System.out.println("Area"+t.getArea()+" "+"周长"+t.getPerimeter());
		}
}
