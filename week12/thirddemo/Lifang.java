package com.tzy.thirddemo;

public class Lifang implements Comparable<Lifang>{
	private int tiji;

	public int getTiji() {
		return tiji;
	}

	public void setTiji(int tiji) {
		this.tiji = tiji;
	}

	public Lifang(int tiji) {
		super();
		this.tiji = tiji;
	}
	@Override
	public int compareTo(Lifang o) {
		// TODO Auto-generated method stub
		return this.tiji-o.tiji>0?-1:(this.tiji-o.tiji==0?0:1);
	}
}
