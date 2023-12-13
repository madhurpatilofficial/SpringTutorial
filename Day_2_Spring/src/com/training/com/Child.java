package com.training.com;

public class Child {
	
	private String childName;

	public Child(String childName) {
		System.out.println("This is a child class para constructor");
		this.childName = childName;
	}

	public Child() {
		System.out.println("This is a child class default constructor");
		
	}


	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
	
	@Override
	public String toString() {
		return "Child [childName=" + childName + "]";
	}
	

}
