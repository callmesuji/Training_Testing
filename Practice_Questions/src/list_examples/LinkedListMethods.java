package list_examples;

import java.util.LinkedList;

public class LinkedListMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();

		list1.add("E");
		list1.add("A");
		list1.add("M");
		list1.add("E");

		list2.add("M");
		list2.add("A");
		list2.add("S");
		list2.add("M");

		System.out.println("Before using add all method " + list1);

		System.out.println();

		list1.addAll(list2);

		System.out.println("After using add all method " + list1);

		System.out.println();

		list1.addFirst("first");

		list2.addLast("last");

		System.out.println("list 1 elements " + list1);

		System.out.println();

		System.out.println("list 2 elements " + list2);

		System.out.println();

		if (list1.contains("E"))
			System.out.println("yes the element E is present");
		else
			System.out.println("no the element E not present");

		System.out.println();

		if (list1.isEmpty())

			System.out.println("yes the list is empty");
		else
			System.out.println("no the list contains elements");
		System.out.println();

		System.out.println("Before clearing elements in list 2 " + list2);

		list2.clear();

		System.out.println();

		System.out.println("After clearing elements in list 2 " + list2);

		System.out.println();
		System.out.println(list2);

		System.out.println("Getting first element of list 2 " + list1.getFirst());

		System.out.println();

		System.out.println("Getting last element of list 2 " + list1.getLast());

		System.out.println();

		System.out.println("index of E is " + list1.indexOf("E"));

		System.out.println();

		System.out.println(list1);
		
		System.out.println();

		System.out.println("After removing the first element " + list1.removeFirst());

		System.out.println();

		System.out.println("After removing the Last element " + list1.removeLast());
		
		System.out.println();
		
		System.out.println(list1);
		
		System.out.println();

		list1.set(0, "sujith");

		System.out.println(list1);
		
		System.out.println();

		System.out.println("Size of the list 1 is " + list1.size());

	}

}
