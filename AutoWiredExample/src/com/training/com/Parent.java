package com.training.com;

import org.springframework.beans.factory.annotation.Autowired;

public class Parent {
	
	private String parentName;
	
	@Autowired
	private Child childObj; //creating child class object
	
	public Parent() {
		System.out.println("Parent default constructor called");
	}
 
	public Parent(String parentName, Child childObj) {
		System.out.println("Parent para const");
		this.parentName = parentName;
		this.childObj = childObj;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Child getChildObj() {
		return childObj;
	}


	public void setChildObj(Child childObj) {
		this.childObj = childObj;
	}


	@Override
	public String toString() {
		return "Parent [parentName=" + parentName + ", childObj=" + childObj + "]";
	}
	
	
	

}
