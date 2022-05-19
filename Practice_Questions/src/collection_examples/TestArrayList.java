package collection_examples;

import java.util.ArrayList;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class TestArrayList {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "sujith");
		Employee emp2 = new Employee(102, "suresh");
		Employee emp3 = new Employee(103, "mahesh");
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);

	}

}
