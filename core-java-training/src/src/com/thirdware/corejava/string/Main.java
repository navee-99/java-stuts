package com.thirdware.corejava.string;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name");
		
		String name = sc.next();
		
		 StringMethods methods=new StringMethods();
		StringOpration opration = new StringOpration();

		opration.stringReverse(name);
		opration.charSeparate(name);
		
		methods.stringMethods();
	}

}
