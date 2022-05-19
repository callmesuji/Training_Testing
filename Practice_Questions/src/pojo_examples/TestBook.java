package pojo_examples;

import java.util.LinkedList;

public class TestBook {
	public static void main(String[] args) {
		LinkedList<Books> list = new LinkedList<>();
		Books book1 = new Books();
		Books book2 = new Books();
		book1.setAuthor("J.K.Rowling");
		book1.setBookName("Harry Potter and the Goblet of Fire");
		book1.setIsbn(12454);
		book1.setYear(2000);

		book2.setAuthor("J.K.Rowling");
		book2.setBookName("Harry Potter and the Philosopher's Stone");
		book2.setIsbn(19875);
		book2.setYear(1997);

		list.add(book1);
		list.add(book2);
		

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}

}
