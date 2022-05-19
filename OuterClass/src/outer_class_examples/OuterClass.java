package outer_class_examples;

public class OuterClass {

	static String name1 = "suresh";
	String name2 = "ramesh";
	private static String name3 = "mahesh";

	public class InnerClass {
		void show() {
			System.out.println(name1);
			System.out.println(name2);
			System.out.println(name3);

		}
	}

}
