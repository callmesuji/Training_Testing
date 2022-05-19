package collection_examples;

import java.util.LinkedList;

public class CollectionExamles {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		for (int i = 0; i < args.length; i++) {
			System.out.println(list.get(0));
		}
		System.out.println();

	}

}
