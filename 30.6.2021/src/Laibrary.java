package assinment2;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Laibrary
{
	public static void add(Scanner sc ,LinkedHashSet<Store> link) {
		   
		
	Store store=new Store();

	
	System.out.println("Enter the book 1");
	store.setBookName(sc.next());
	System.out.println("Enter the book 2");
	store.setBookName1(sc.next());
	link.add(store);
	System.out.println("books are added");
	System.out.println(link.toString());
	}

	public static void remove(Scanner sc ,LinkedHashSet<Store> link) {
		System.out.println("enter the book name to remove ");
		String name =sc.next();
		for(Store s:link) {
			if (name==s.getBookName()) {
				link.remove(name);
				break;
			}
		}
		System.out.println("books are removed");
		System.out.println(link.toString());
	}
	public static void change(Scanner sc ,LinkedHashSet<Store> link) {
		System.out.println("enter the book name to remove ");
		String name=sc.next();
		for (Store s: link) {
			if(name==s.getBookName()) {
				System.out.println("enter the book name  ");
				s.setBookName(sc.next());
				
			}
			System.out.println(link.toString());
			
		}
		
	}

	public static void main(String[] args)
	{
		 LinkedHashSet<Store> link=new LinkedHashSet<Store>();
	    boolean status=true;
	    Scanner sc=new Scanner(System.in);
	    add(sc, link);
	    remove(sc, link);
	     change(sc, link) ;
}
}
