package listcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList list=new ArrayList();
		 list.add(10);
		
		 list.add("ten");
		 System.out.println(list);
		 
		 Iterator it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
