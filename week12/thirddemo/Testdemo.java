package com.tzy.thirddemo;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Testdemo {
	public static void main(String[] args) {
		Lifang[] a=new Lifang[10];
		Scanner sc=new Scanner(System.in);	
		//ArrayList<Lifang> list=new ArrayList<Lifang>();
		for(int i=0;i<10;i++){
			a[i]=new Lifang(sc.nextInt());
			//list.add(a[i]);
		}
		/*Collections.sort(list, new Comparator<Lifang>() {
			@Override
			public int compare(Lifang o1, Lifang o2) {
				// TODO Auto-generated method stub
				return o1.getTiji()-o2.getTiji()>0?1:(o1.getTiji()-o2.getTiji()==0?0:-1);
			}
		});*/
		Arrays.sort(a);
		for(int i=0;i<10;i++){
			System.out.println(a[i].getTiji());
		}
		
	}
}
