package com.zytong.first;

import java.util.Scanner;

public class Firstdemo {
	static int []a={31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		System.err.println("������ݺ��·�:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x%400==0||(x%4==0&&x%100!=0)){
			a[1]++;
		}
		for(int i=0;i<12;i++){
			if(y==i+1){
				System.err.println(x+"��"+y+"�µ�����Ϊ:"+a[i]);
			}
		}
	}
	

}
