import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

public class StringS implements   Comparable<StringS> {
	int no;
	String animal;
	static String note;
	StringS(int no,String animal){
		this.no=no;
		this.animal=animal;
		
	}
	public String toString() {
		return animal+" "+no;
		
	}

	@Override
	public int compareTo(StringS o) {
		// TODO Auto-generated method stub
		return animal.compareTo(o.animal);
	}
	public static void main(String []arg)throws Exception {
		Set<StringS> obj=new TreeSet<StringS>();
		File input=new File("C:\\Users\\BCP\\ Documents\\input.txt");
		File output=new File("C:\\Users\\BCP\\Documents\\output.txt ");
		FileReader Read;
		FileWriter Write;
		try {
			Read=new FileReader (input);
			Write=new FileWriter (output);
			BufferedReader read=new BufferedReader(Read);
			BufferedWriter write=new BufferedWriter(Write);
			while((note=read.readLine())!=null) {
				String [] separate=note.split(",");
				StringS person=new StringS(Integer.parseInt(separate[0]),separate [1]);
				obj.add(person);
			}
			System.out.println(obj);
			for(StringS sorted:obj) {
				write.write(sorted.toString());
				write.newLine();
			}
			write.flush();
			Thread.sleep(500);
			write.close();
			read.close();
		}catch(Exception e) {
			String exception=e.getMessage();
			System.out.println(exception);
		}
		
	}
	

}
