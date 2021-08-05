package exceptionprogrames;

public class TryCatchException {

	public static void main(String args[]){
		String  s=null;
		int a[]=new int [5];
		try {
			System.out.println(a[10]=50);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
			
		}
		try{  
         
			int data=100/0;  
		}catch(ArithmeticException e)
		
		
		{
			System.out.println(e);
		}  
		try {
			 System.out.println(s.length());
		}
		catch(NullPointerException e) {
		 System.out.println(e);
		}

		System.out.println("rest of the code...");  
	}  
}  
