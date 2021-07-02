package assinment2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Library
{
	

	private static Scanner s;

	public static void main(String[] args)
	{
		 LinkedHashSet<Store> linkedHashSet=new LinkedHashSet<Store>();
	    boolean status=true;
	  
	    Scanner sc=new Scanner(System.in);
	    while(status)
		{
		System.out.println("Enter the book name");
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
	 
	   
	    System.out.println("Enter the data what operation want to do");
	    System.out.println("1 for add,2 for remove");
	   
	    int value=sc.nextInt();
	 
		switch(value)
	    {
	    case 1:
	    	while(status)
	    	{
	    	System.out.println("Enter the book name");
	    	String s2="end";
	    	String addName=sc.next();
	         if(addName.equals(s2))
	         {
	        	 status=false;
	        	 break;
	         }
	         linkedHashSet.add(new Store(addName));
	    	}
	    	
	    	   while( ls.hasNext())
	    	   {
	    		   System.out.println(ls.next());
	    	   }
	    	break;
	    case 2:
	    	while(status)
	    	{
	    	System.out.println("Enter the bookname to delete ");
	    	String bookName=sc.next();
	    	String s3="end";
	    	 if(bookName.equals(s3))
	         {
	        	 status=false;
	        	 break;
	         }
	    	 linkedHashSet.remove(bookName);
	    	}
	    	
	    	   while(ls.hasNext())
	    	   {
	    		   System.out.println(ls.next());
	    	   }
	    	break;
	    }
	    
	}
}
