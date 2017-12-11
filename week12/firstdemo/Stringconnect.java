package com.tzy.firstdemo;

import java.util.Scanner;

public class Stringconnect {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] str =new String[10];
		StringBuffer a=new StringBuffer();
		for(int i=0;i<10;i++){
			str[i]=sc.nextLine();
			a.append(str[i]);
		}
		System.out.println(a.toString());
	}

}
