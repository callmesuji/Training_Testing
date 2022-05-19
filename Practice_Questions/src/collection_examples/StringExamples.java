package collection_examples;

import java.util.ArrayList;

public class StringExamples {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("collection");
		list.add("list");
		list.add("linkedlist");
		list.add("set");
		System.out.println(list);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

	}

}
