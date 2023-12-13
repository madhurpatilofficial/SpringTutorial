package com.training.com;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private int empId;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	@Required
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	@Required
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}
