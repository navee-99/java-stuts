package com.thirdware.corejava.polymorphism;

public class Employee {

	public void employeDetails(int id, String name) {

		System.out.println("ID  : " + id + "\n" + "NAME : " + name);
	}

	public void employeDetails(int id, String name, String city) {

		System.out.println("After Overloading");

		System.out.println("ID  : " + id + "\n" + "NAME : " + name + "\n" + " CITY : " + city);
	}
}
