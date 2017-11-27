package com.tzy.thirddemo;

import java.util.Arrays;

public class Checkingaccount extends Account{
	float limitedmoney;
	void limite(){
		if(rest<limitedmoney){
			System.out.println("账户已到达透支限定额");
		}
	}
	public String toString() {
		return "Checkingaccount [number=" + super.number + ", rest=" + super.rest + ", rate=" + super.rate + "]";
	}
}
