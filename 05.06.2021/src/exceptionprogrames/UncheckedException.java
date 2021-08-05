package exceptionprogrames;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Ravi";
		String b = "Ram";
		String c = null;
		try
		{

			System.out.println("First name = " +a);
			System.out.println("Second name = " +b);
			System.out.println("Third name = " +c);


			System.out.println("Concatination of String = " + c.concat(a));
		}
		catch(NullPointerException e)
		{
			System.out.print("NullPointerException exception is occured"); 
		}
	}

}
