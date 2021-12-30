package com.thirdware.corejava.string;

public class StringMethods {

	
	public void stringMethods() {
		
		String name="Corejava";
		
		String string="springboot";
		
		
		
		
		System.out.println( name.length()); 
		System.out.println( name.equals(string)); 
		System.out.println( name.concat(string)); 
		System.out.println( name.isEmpty()); 
		
		System.out.println( name.toUpperCase()); 
		System.out.println( name.toLowerCase()); 
		System.out.println( name.endsWith("ends")); 
		
		System.out.println( string.startsWith("spring")); 
		System.out.println( string.equals(name)); 
		
		System.out.println( name.lastIndexOf("a")); 
		System.out.println( string.repeat(2)); 
		
	}
}
