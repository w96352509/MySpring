package com.study.spring.case01;

public class Husband {
	private String name;
	private Wife wife;

	public Husband(String name, Wife wife) {

		this.name = name;
		this.wife = wife;
	}

	public Husband() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	

}
