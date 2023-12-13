package com.training.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("std1")
	private Student std;

	public Profile() {

	}

	public Profile(Student std) {
		this.std = std;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Profile [std=" + std + "]";
	}

}