package com.arthur.weibo;

public class Weibo {

	private String name;
	public Weibo(String name){
		this.name = name;
	}
	
	public String toString(){
		System.out.print("Create a new Weibo:");
		return name;
	}
	
}

