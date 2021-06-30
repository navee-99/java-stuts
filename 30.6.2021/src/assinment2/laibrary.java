package assinment2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class laibrary {
	public static void main (String a[]) {
	
		LinkedHashSet<String> link=new LinkedHashSet<String>();
		Scanner sc=new Scanner(System.in);
		
		link.add(sc.next());
		link.add(sc.next());
		link.add(sc.next());
		
		Iterator itr=link.iterator();
		while(itr.hasNext()) {
          System.out.print(itr.next()+",");
		}
          System.out.println();
		
			
	   link.remove(sc.next());
	   Iterator itr1=link.iterator();
			  while(itr1.hasNext()) {
			 System.out.print(itr1.next()+","); 
			 }
			 
		
	}

}
