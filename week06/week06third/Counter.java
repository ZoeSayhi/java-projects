package com.tzy.week06third;

import java.util.Scanner;

public class Counter {
	public static double One(int x,int y){
		double sum;
		double a,b;
		a=(double)x;
		b=(double)y;
		sum=a/b;
		return sum;
	}
	public static double Two(float x,float y){
		double sum;
		double a,b;
		a=(double)x;
		b=(double)y;
		sum=a/b;
		return sum;
	}
	public static double Three(double x,double y){
		double sum;
		double a,b;
		a=(double)x;
		b=(double)y;
		sum=a/b;
		return sum;
	}
	public static void main(String[] args) {
		double s=0;
		System.err.println("输入计算方式：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1){
			int x = sc.nextInt();
			int y = sc.nextInt();
			s=One(x,y);
			System.err.println(s);	
		}
		else if(n==2){
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			s=Two(x,y);
			System.err.println(s);	
		}
		else if(n==3){
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			s=Three(x,y);
			System.err.println(s);	
		}
	}
}
