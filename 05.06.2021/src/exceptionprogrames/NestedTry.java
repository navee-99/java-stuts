package exceptionprogrames;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a=10/0;
				System.out.println("10 divided by 0 ");
				
				
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]=new int [11];
				a[11]=1;
						System.out.println(" 1 in 11th index ");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
System.out.println("normal flow");
	}
 
}
