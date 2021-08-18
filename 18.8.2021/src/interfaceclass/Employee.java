package interfaceclass;


interface Organaisation{
	void employeName();
}
interface Domain{
	void domainName();
	
}
public class Employee implements Domain,Organaisation{

	@Override
	public void employeName() {
		// TODO Auto-generated method stub
		System.out.println("naveen");
	}

	@Override
	public void domainName() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
public static void main(String [] arg) {
	Employee name = new Employee();
	name.employeName();
	name.domainName();
}
}
