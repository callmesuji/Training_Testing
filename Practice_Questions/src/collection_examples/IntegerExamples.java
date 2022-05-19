package collection_examples;

import java.util.ArrayList;

public class IntegerExamples {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(30);

		System.out.println(list);

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

	}

}
