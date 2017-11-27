package com.zytong.week05;

public class second {
	public static void main(String[] args) {
		int a=123456;
		int c=10;
		int sum=0;
		for(int i=0;i<6;i++){
				sum=sum+a%c;
				a=a/10;
		}
		System.out.println(sum);	
	}
}
