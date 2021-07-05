package assinment2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Laibrarys extends Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Store> linkedHashSet=new LinkedHashSet<Store>();
		Scanner sc=new Scanner(System.in);
		  Table list=new Laibrarys();
		
		   list.add(sc, linkedHashSet);
		   list.remove(sc, linkedHashSet);
	}

}
