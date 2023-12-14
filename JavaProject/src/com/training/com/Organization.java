package com.training.com;

public class Organization {

	private String orgName;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Organization(String orgName) {
		this.orgName = orgName;
	}

	public Organization() {
	}

	@Override
	public String toString() {
		return "Organization [orgName=" + orgName + "]";
	}



}
