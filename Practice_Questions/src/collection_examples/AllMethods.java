package collection_examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class AllMethods {
	public static void main(String[] args) {
		 
		Collection<String> list = new LinkedList<>();
		list.add("mahesh");

		Collection<String> collect = new LinkedList<>();
		collect.add("A");
		collect.add("pen");
		collect.add("boy");

		System.out.println("The LinkedList is: " + list);

		list.addAll(collect);

		System.out.println("The new linked list is: " + list);

		Set<String> set = new HashSet<String>();
		set.add("dog");
		set.add("cat");

		System.out.println("set contains " + set);
		set.clear();
		System.out.println("after clearing set " + set);

		if (set.isEmpty())
			System.out.println("yes set is empty");
		else
			System.out.println("no set contains elements");

		ArrayList<String> arrlist = new ArrayList<String>(5);
		arrlist.add("A");
		arrlist.add("D");
		arrlist.add("M");
		arrlist.add("M");
		arrlist.add("D");

		System.out.println("Last Index of array list is " + arrlist.lastIndexOf("E"));
		System.out.println("Array list contents before removing " + arrlist);

		arrlist.remove(0);
		System.out.println("Array list contents after removing " + arrlist);

		arrlist.set(0, "mahesh");
		arrlist.set(1, "kaur");
		System.out.println("After using set method " + arrlist);
		

		System.out.println("size of arrlist is " + arrlist.size());
	}

}
