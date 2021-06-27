import java.io.*;
import java.util.*;


public class csvFile {
	public static void main(String []ags ) throws Exception {
		Scanner sc=new Scanner(new File("C:\\Users\\BCP\\Documents\\newcsv.csv "));
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
	

}
