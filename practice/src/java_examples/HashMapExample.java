package java_examples;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter state ");
		String name = sc.nextLine();
		getvalues(name);
		sc.close();
	}

	private static void getvalues(String name) {
		HashMap<String, String> map = new HashMap<>();

		map.put("karnataka", "Bengaluru");
		map.put("punjab", "chandigarh");
		map.put("gujarat", "Gandhinagar");

		if (map.get(name) != null) {
			System.out.println(name + " " + map.get(name));
		}
	}
}
