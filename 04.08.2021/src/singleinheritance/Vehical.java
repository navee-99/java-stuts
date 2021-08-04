package singleinheritance;

public class Vehical {

	
	public void vehicalType() {
		System.out.println(" car ,bike, "); 
	}
}
	 class Car extends Vehical{
		
		public void vehicalType() {
			System.out.println(" car");
			
		}
		public void price() {
			System.out.println("5 lacks");
		}
	}

	class SingleLevelInheritance{
		public static void main(String []arg) {
		
	Car car = new Car();
	Vehical n=	new Vehical();
	car.vehicalType();
	car.price();
	n.vehicalType();
	}
}
