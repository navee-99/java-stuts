package hiraricallinheritance;

public class Vehical {

	
	public void vehicalType() {
		System.out.println(" car ,bike, "); 
		
	}
	public void useOfVechical() {
		System.out.println("travel");
	}
}
	 class Car extends Vehical{
		
		public void vehicalType() {
			System.out.println(" car");
			
		}
		public void price() {
			System.out.println("5 lacks");
		}
		public void carCompany() {
			System.out.println("ktm");
		}
	}
	 class Bike extends Vehical
	 {
		 public void vehicalType() {
			 System.out.println("bike");
		 }
		 public void price() {
				System.out.println("1 lacks");
			}
	 }
	class HierarchicalInheritance{
		public static void main(String []arg) {
		
	Car car = new Car();
	Vehical v=	new Vehical();
	Bike bike= new Bike  ();
	car.vehicalType();
	car.price();
	v.vehicalType();
	bike.vehicalType();
	bike.price();
	bike.useOfVechical();
	
	}
}
