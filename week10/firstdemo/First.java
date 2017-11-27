package com.tzy.firstdemo;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		int count=0;
		int t=0;
		int j=0;
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		int len1=a.length();
		int len2=b.length();
		if(len1>=len2){
			for(int i=0;i<len1;i++){
				    j=i;
					for(t=0;t<len2;t++){
						if(a.charAt(j)==b.charAt(t)){
							j++;
						}
						else break;
					}
					if(t==len2){
						count++;
					}
				}
			}
			System.out.println(count);
		}
}
	
