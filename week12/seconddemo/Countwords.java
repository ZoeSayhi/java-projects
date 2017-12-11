package com.tzy.seconddemo;

import java.util.Scanner;

public class Countwords {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String[] a=str.split(" ");
		int max=a[0].length();
		int len=a.length;
		int[] num=null;
		num=new int[len];
		int[] count=null;
		count=new int[len];
		int j=0;
		for(int i=0;i<len;i++){
			if(a[i].length()>max){
				max=a[i].length();
			}
		}
		for(int i=0;i<len;i++){
			if(a[i].length()==max){
				num[j]=i;
				j++;
			}
		}
		for(int s=0;s<j;s++){
			for(int i=0;i<len;i++){
				if(a[i].equals(a[num[s]])){
					count[num[s]]++;
				}
			}
			System.out.println(a[num[s]]+" "+a[num[s]].length()+" "+count[num[s]]);
		}
	}
}
