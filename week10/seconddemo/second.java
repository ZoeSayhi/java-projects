package com.tzy.seconddemo;

import java.util.Arrays;
import java.util.Scanner;

public class second{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] stu =new String[10];
		int min =0;
		String temp=null;
		for(int i=0;i<10;i++){
			stu[i]=scan.nextLine();
		}
		for(int i=0;i<10;i++){
			min=i;
			for(int j=i;j<10;j++){
				if(stu[j].compareTo(stu[min])<0){
					min=j;
				}
				if(min!=i){
					temp=stu[min];
					stu[min]=stu[i];
					stu[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(stu));
	}
}
