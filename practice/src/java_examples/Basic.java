package java_examples;

class EmployeeDetails  {
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public EmployeeDetails(String name, String number, String decimal_value, int num, double salary, float num1) {
		super();
		this.name = name;
		this.number = number;
		this.decimal_value = decimal_value;
		this.num = num;
		this.salary = salary;
		this.num1 = num1;
	}


	/*
	 * primitive data types char boolean byte short
	 * 
	 * String int float double
	 * 
	 */

	String name = "sujith";


	String number = "12345";

	String decimal_value = "25.05";

	int num = 10;

	double salary = 25000.50;

	float num1 = 2506;
	
	

}

class PersonDetails {

	String name1 = "Jaya Surya";
	String name2 = "Devaraju";

}

public class Basic {

	public static void main(String[] args) {

		EmployeeDetails suji = new EmployeeDetails();
		
		 
		iamdisplay();
		 

	}

	private static void iamdisplay() {
		// TODO Auto-generated method stub
		
	}

	 
}
