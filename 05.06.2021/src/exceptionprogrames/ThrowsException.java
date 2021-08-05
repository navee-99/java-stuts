package exceptionprogrames;

import java.io.IOException;

public class ThrowsException {



	void method()throws IOException{  
		throw new IOException("device error");  
	}  

  
	public static void main(String args[])throws IOException{ 
		ThrowsException m=new ThrowsException();  
		m.method();  

		System.out.println("normal flow...");  
	}

}
