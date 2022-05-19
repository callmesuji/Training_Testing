package com.lwl.exam;

public abstract class Employee {

	abstract void setSalary(int salary);

	abstract int getSalary();

	abstract void setGrade(String Grade);

	abstract String getGrade();

	void label() {

		System.out.println("Employees data: \n");
	}
}

class Engineer extends Employee {

	private int salary;
	private String Grade;

	@Override
	void setSalary(int salary) {
		// TODO Auto-generated method stub

	}

	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void setGrade(String Grade) {
		// TODO Auto-generated method stub

	}

	@Override
	String getGrade() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Manager extends Employee {
	private int salary;
	private String Grade;

	@Override
	void setSalary(int salary) {
		// TODO Auto-generated method stub

	}

	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void setGrade(String Grade) {
		// TODO Auto-generated method stub

	}

	@Override
	String getGrade() {
		// TODO Auto-generated method stub
		return null;
	}

}