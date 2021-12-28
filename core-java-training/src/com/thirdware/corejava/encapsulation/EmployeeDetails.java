package com.thirdware.corejava.encapsulation;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee sam = new Employee(1234, "sam", "madurai",1234567666);
		Employee ram = new Employee();
		
		ram.setEmployeeName("ram");
		ram.setEmployeeId(2345);
		ram.setMobileNumber(123455667);
		ram.setAddress("chennai");
		
		System.out.println(sam);
		System.out.println(ram);
	}

}
