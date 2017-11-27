package com.tzy.thirddemo;

public class Savingaccount extends Account{
	void overdraw(){
		if(rest<0){
			System.out.println("ÕË»§ÒÑÍ¸Ö§");
		}
	}
}
