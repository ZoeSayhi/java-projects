package com.tzy.week06first;

import java.util.Scanner;

public class First {
	public static int Add(int a){;
		if(a==1){
			return 1;
		}
		else{
			return a*Add(a-1);
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s=0;
		for(int i=1;i<=x;i++){
			s=s+Add(i);
		}
		System.err.println(s);
	}

}
