package com.study.spring;

import java.util.jar.Attributes.Name;

public class Wife {
private String name ;
private Husband husband;
public Wife(String name, Husband husband) {
	
	this.name = name;
	this.husband = husband;
}
public Wife() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Husband getHusband() {
	return husband;
}
public void setHusband(Husband husband) {
	this.husband = husband;
}

}
