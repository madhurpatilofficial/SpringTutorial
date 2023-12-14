package com.training.com;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {	

	private int id;
	private String name;
	private String role;

	private Organization org;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public Employee(int id, String name, String role, Organization org) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.org = org;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", org=" + org + "]";
	}

	

}
