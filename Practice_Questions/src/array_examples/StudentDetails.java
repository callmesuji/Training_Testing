package array_examples;

import java.util.Scanner;

class Student {
	private int rollno;
	private String name;
	private int age;

	/*
	 * public Student() { super(); rollno = 0; name = null; age = 0; }
	 */

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class StudentDetails {

	public static void main(String[] args) {

		Student s[] = new Student[2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter name");
			s[i].setName(sc.nextLine());
			s[i].setAge(22 + i);
			s[i].setRollno(100 + i);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName() + " " + s[i].getAge() + " " + s[i].getRollno());
		}
	}

}
