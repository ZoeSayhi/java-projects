package com.zytong.second;

import java.util.Scanner;

public class Seconddemo {
	public static void main(String[] args) {
		int num=0;
		int w=0;
		String day[]={"����һ","���ڶ�","������","������","������","������","������"};
		int s[]={31,59,90,120,151,181,212,243,273,304,334,365};
		System.err.println("2007��1��1��Ϊ��һ");
		System.err.println("������ݺ͵ڼ���:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%400==0||(a%4==0&&a%100!=0)){
			System.err.println(a+"��Ϊ����");
			for(int i=1;i<12;i++){
				s[i]++;
			}
		}
		if(b<s[0]){
				System.err.println(a+"��ĵ�1��");
		}
		for(int i=0;i<12;i++){
			if(b>s[i]&&b<=s[i+1]){
				i=i+2;
				System.err.println(a+"��ĵ�"+i+"��");
			}
		}
		if(a>2008){
			num=(a-2007)*365+(a-2008)/4-1;
			w=b-(7-num%7-1);
			if(b<=(7-num%7)){
				System.err.println("��"+b+"��Ϊ"+day[num%7-1+b]);
			}
			else{
				System.err.println("��"+b+"��Ϊ"+day[w%7]);
			}
		}
		else if(a==2007){
			System.err.println("��"+b+"��Ϊ"+day[b%7-1]);
		}
		else if(a==2008){
			num=(a-2007)*365;
			w=b-(7-num%7);
			if(b<=(7-num%7)){
				System.err.println("��"+b+"��Ϊ"+day[num%7-1+b]);
			}
			else{
				System.err.println("��"+b+"��Ϊ"+day[w%7-1]);
			}
		}
	}

}
