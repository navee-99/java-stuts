package assinment2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Table {
	
	Scanner sc=new Scanner(System.in);
	
	public void add(Scanner sc,LinkedHashSet<Store> linkedHashSet) {
	
	 
	    boolean status=true;
	  
	    
	    while(status)
		{
		System.out.println("Enter the book name");
		System.out.println("enter end to complete");
		String s2="end";
		String name=sc.next();
	     if(name.equals(s2))
	     {
	    	 status=false;
	    	 break;
	     }
	     linkedHashSet.add(new Store(name));
		
		}
	    System.out.println("you ended this list");
	   
	   System.out.println(linkedHashSet.toString());
	 
	   
	  //  System.out.println("Enter the data what operation want to do");
}
	
		public void remove(Scanner sc,LinkedHashSet<Store> linkedHashSet) {
		
		    boolean status=true;
		    while(status)
	    	{
	    	System.out.println("Enter the bookname to delete ");
	    	
	    	String s3="end";
	    	String bookName=sc.next();
	    	 if(bookName.equals(s3))
	         {
	        	 status=false;
	        	 break;
	         }
	    	 linkedHashSet.remove(new Store(bookName));
	    	}
		    System.out.println(linkedHashSet.toString());
		}
	          
	
}