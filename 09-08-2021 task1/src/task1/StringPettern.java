package task1;

public class StringPettern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="JAVAJ2EE";

		char a[]=name.toCharArray();
		System.out.println(a);

		for(int i=0;i< a.length;i++){

			for(int j=0;j< i;j++) {

				System.out.print(a[j]+" ");

			}
			System.out.println();
		}
		for(int i=a.length;i>=0;i--) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print(a[j]+" ");
				
			}System.out.println();
		}


	}

}
