package com.tzy.thirddemo;

import java.util.Arrays;
import java.util.Scanner;

public class Banji {
     String classname;
     public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		Student[] stu=new Student[5];
		int min =0;
		String temp=null;
		for(int i=0;i<5;i++){
			stu[i].stuname=scan.nextLine();
		}
		
		for(int i=0;i<10;i++){
			min=i;
			for(int j=i;j<10;j++){
				if(stu[j].stuname.compareTo(stu[min].stuname)<0){
					min=j;
				}
				if(min!=i){
					temp=stu[min].stuname;
					stu[min].stuname=stu[i].stuname;
					stu[i].stuname=temp;
				}
			}
		}
		System.out.println(Arrays.toString(stu));
	}
     
}
