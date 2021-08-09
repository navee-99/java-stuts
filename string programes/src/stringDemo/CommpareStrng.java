package stringDemo;

public class CommpareStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin";  
		String s2="Sachin";  
		String s3=new String("Sachin");  
		String s4="Saurav";  
		System.out.println(s1.equals(s2));  
		System.out.println(s1.equals(s3));  
		System.out.println(s1.equals(s4));
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		String s="SachinTendulkar";    
		 System.out.println("Original String: " + s);  
		 System.out.println("Substring starting from index 6: " +s.substring(6));   
		 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6));
	}

}
