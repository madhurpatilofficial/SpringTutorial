package com.training.com;

public class Student {
	private String studentName;
	private int age;
	private String div;
	private String schoolName;

	public Student() {
	}

	public Student(String studentName, int age, String div, String schoolName) {
		this.studentName = studentName;
		this.age = age;
		this.div = div;
		this.schoolName = schoolName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age + ", div=" + div + ", schoolName=" + schoolName
				+ "]";
	}

}