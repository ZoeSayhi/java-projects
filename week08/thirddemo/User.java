package com.tzy.thirddemo;

public class User {
	private String userName;
	private String userWords;
	static int userCount;
	public User() {
		super();
	}
	public User(String name) {
		this.userName=name;
	}
	public User(String name,String words) {
		this.userName=name;
		this.userWords=words;
	}
	public String getUserWords() {
		return userWords;
	}
	public void setUserWords(String userWords) {
		this.userWords = userWords;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userWords=" + userWords + "]";
	}
	public static void main(String[] args) {
		User s =new User("ºìºì", "À´Áìºì°ü°É");
		System.out.println(s.toString());
	}
}
