package collection_examples;

import java.util.ArrayList;

class Student {
	private int rollno;
	private String name;

	public Student() {
		super();
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Student> arrlist = new ArrayList<>();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		arrlist.add(s1);
		arrlist.add(s2);
		arrlist.add(s3);
		arrlist.add(s4);

		s1.setRollno(1001);
		s1.setName("suresh");

		s2.setRollno(1002);
		s2.setName("ramesh");

		s3.setRollno(1003);
		s3.setName("rupesh");

		s4.setRollno(1004);
		s4.setName("lokesh");

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist);
		}
		
		for (Student s : arrlist) {
			System.out.println(s);
		}
	}

}
