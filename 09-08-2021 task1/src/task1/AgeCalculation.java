package task1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculation {
	
	
	public  void age() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your date of birth in yyyy-mm-dd  this formate");
		String date=sc.nextLine();
		LocalDate dob= LocalDate.parse(date);
		System.out.println(date);
		LocalDate currentDate=LocalDate.now();
		int age=Period.between(dob, currentDate).getYears();
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeCalculation name = new AgeCalculation();
		name.age();
	}

}
