package encapsulation;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataClass name = new DataClass();
		
		name.setPlace("chennai");
		name.setName("naveen");
		name.setId(105);
		System.out.println(name.getName());
		System.out.println(name.getId());
		System.out.println(name.getPlace());
	}

}
