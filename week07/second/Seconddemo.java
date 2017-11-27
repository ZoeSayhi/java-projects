package com.zytong.second;

import java.util.Scanner;

public class Seconddemo {
	public static void main(String[] args) {
		int num=0;
		int w=0;
		String day[]={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		int s[]={31,59,90,120,151,181,212,243,273,304,334,365};
		System.err.println("2007年1月1日为周一");
		System.err.println("输入年份和第几天:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%400==0||(a%4==0&&a%100!=0)){
			System.err.println(a+"年为闰年");
			for(int i=1;i<12;i++){
				s[i]++;
			}
		}
		if(b<s[0]){
				System.err.println(a+"年的第1月");
		}
		for(int i=0;i<12;i++){
			if(b>s[i]&&b<=s[i+1]){
				i=i+2;
				System.err.println(a+"年的第"+i+"月");
			}
		}
		if(a>2008){
			num=(a-2007)*365+(a-2008)/4-1;
			w=b-(7-num%7-1);
			if(b<=(7-num%7)){
				System.err.println("第"+b+"天为"+day[num%7-1+b]);
			}
			else{
				System.err.println("第"+b+"天为"+day[w%7]);
			}
		}
		else if(a==2007){
			System.err.println("第"+b+"天为"+day[b%7-1]);
		}
		else if(a==2008){
			num=(a-2007)*365;
			w=b-(7-num%7);
			if(b<=(7-num%7)){
				System.err.println("第"+b+"天为"+day[num%7-1+b]);
			}
			else{
				System.err.println("第"+b+"天为"+day[w%7-1]);
			}
		}
	}

}
