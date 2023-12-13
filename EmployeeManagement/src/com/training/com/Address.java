package com.training.com;

public class Address {

	private String street;
	private String cityName;
	private String state;
	private String societyName;
	private String flatNo;

	public Address() {
		System.out.println("Default constructor");
	}

	public Address(String street, String cityName, String state, String societyName, String flatNo) {
		System.out.println("Parameterised constructor");
		this.street = street;
		this.cityName = cityName;
		this.state = state;
		this.societyName = societyName;
		this.flatNo = flatNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", cityName=" + cityName + ", state=" + state + ", societyName="
				+ societyName + ", flatNo=" + flatNo + "]";
	}

}
