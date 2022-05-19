package list_examples;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("dog");
		list.add("cat");
		list.add("horse");

		list.add("10");
		list.add("5");
		list.add("4");

		for (String s : list) {
			System.out.println(s);
		}

	}

}
