package list_examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayExamples {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(5);
		list.add(1);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
