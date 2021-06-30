package assinment2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class laibrary {
	public static void main (String a[]) {
	
		LinkedHashSet<String> link=new LinkedHashSet<String>();
		link.add("java");
		link.add("jsp");
		link.add("jpa");
		link.add("angular");
		link.add("spring");
		Iterator itr=link.iterator();
		while(itr.hasNext()) {
          System.out.print(itr.next()+",");
		}
          System.out.println();
		
		link.remove("jpa");
		Iterator itr1=link.iterator();
		while(itr1.hasNext()) {
          System.out.print(itr1.next()+",");
		}
		
	}

}
