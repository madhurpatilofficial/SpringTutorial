package com.training.com;

import java.util.List;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private Address perAddress; // Created Address object in Employee Class
	private List<String> technologyList;
	private List<Projects> projects;   // Created Projects object in Employee Class

	public Employee() {
		System.out.println("Default constructor of Employee is called");
	}

	public Employee(int empId, String name, double salary, Address address, List<String> technologyList,
			List<Projects> projects) {
		System.out.println("Parameterised constructor of Employee is called");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public List<String> getTechnologyList() {
		return technologyList;
	}

	public void setTechnologyList(List<String> technologyList) {
		this.technologyList = technologyList;
	}

	public int getEmpId() {
		System.out.println("getEmpId of Employee is called");
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("setEmpId of Employee is called");
		this.empId = empId;
	}

	public String getName() {
		System.out.println("getName of Employee is called");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName of Employee is called");
		this.name = name;
	}

	public double getSalary() {
		System.out.println("getSalary of Employee is called");
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("setSalary of Employee is called");
		this.salary = salary;
	}


	// address class
	public Address getPerAddress() {
		return perAddress; // returning address of address class
	}

	public void setPerAddress(Address perAddress) {
		this.perAddress = perAddress;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", perAddress=" + perAddress
				+ ", technologyList=" + technologyList + ", projects=" + projects + "]";
	}
}
