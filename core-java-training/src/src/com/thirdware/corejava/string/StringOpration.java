package com.thirdware.corejava.string;

public class StringOpration {

	public void stringReverse(String name) {

		// char a[]=name.toCharArray();
		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));

		}
		
		System.out.println();
	}

	public void charSeparate(String name) {
		
		
		for(int i=0;i<=name.length()-1;i++) {
			
			System.out.println(name.charAt(i));
		}
		
	}
}
