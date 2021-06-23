import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

public class person  implements Comparable<person>{
	int no;
	String na;
	static String note;

	public person(int no,String na) {
	this.no=no;
		this.na=na;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return no+" "+na;
	}
	public int compareTo(person o) {
		// TODO Auto-generated method stub
		return na.compareTo(o.na);
	}

	public static void main(String[] args) throws Exception {
		Set<person> obj1=new TreeSet<person>();
		// TODO Auto-generated method stub
		File fileread=new File("C:\\Users\\BCP\\Documents\\naveen.txt");
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
		Set<person> obj = null;
		while((note=bread1.readLine())!=null) {
			String [] soterd=note.split(" ,");
				person naveen=new person(Integer.parseInt(soterd[0]), soterd[1]);
				obj.add(naveen);
		}
		System.out.println(obj);
		for(person sorted: obj) {
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
		
