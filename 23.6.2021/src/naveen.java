
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

public class naveen  implements Comparable<naveen>{
	int no;
	String na;
	static String note;

	public naveen(int no,String na) {
	this.no=no;
		this.na=na;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return no+" "+na;
	}
	public int compareTo(naveen o) {
		// TODO Auto-generated method stub
		return na.compareTo(o.na);
	}

	public static void main(String[] args) throws Exception {
		Set<naveen> obj1=new TreeSet<naveen>();
		// TODO Auto-generated method stub
		File fileread=new File("C:\\Users\\BCP\\Documents\\abc.txt");
		File filewrite=new File("C:\\Users\\BCP\\Documents\\navee.txt");
		FileReader bread;
		FileWriter bwrite;
		try {
			bread =new FileReader(fileread);
			bwrite=new FileWriter(filewrite);
		
		BufferedReader bread1=new BufferedReader(new FileReader(fileread));
		//File filewrite=new File("C:\\Users\\BCP\\Documents\\naveen1");
		BufferedWriter bwrite1=new BufferedWriter(new FileWriter(filewrite));
		
	System.out.println("file was readed");
		//Set<naveen> obj = null;
		while((note=bread1.readLine())!=null) {
			String [] soterd=note.split(" ,");
				naveen naveen=new naveen(Integer.parseInt(soterd[0]), soterd[1]);
				obj1.add(naveen);
		}
		System.out.println(obj1);
		for(naveen sorted: obj1) {
			bwrite1.write(sorted.toString());
			bwrite1.newLine();
		}
		
			bwrite1.flush();
			Thread.sleep(5000); 
			System.out.println("file has readed");
			System.out.println("file in file");
			bwrite1.close();
			bread1.close();
		}catch(Exception ex) {
			String error=ex.getMessage();
			System.out.println(error);
		}
	}
}
		
