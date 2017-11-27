package com.tzy.thirddemo;

import java.util.Arrays;

public class Account {
	String number;
	float rest;
	float rate;
	int[] date =new int[8];
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public float getRest() {
		return rest;
	}
	public void setRest(float rest) {
		this.rest = rest;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int[] getDate() {
		return date;
	}
	public void setDate(int[] date) {
		this.date = date;
	}
	void Save(float money){
		rest=rest+money;
	}
	void Takeout(float money){
		rest=rest-money;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", rest=" + rest + ", rate=" + rate + ", date=" + Arrays.toString(date)
				+ "]";
	}
}
