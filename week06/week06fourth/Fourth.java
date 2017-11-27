package com.tzy.week06fourth;

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long sum=0;
		if(x!=0){
			sum=sum+x%10;
			x=x/10;
		}
		System.err.println(sum);
	}
}
