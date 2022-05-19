package outer_class_examples;

public class Outer {

	String name = "suresh";

	void show() {

		class inner {

			void hello() {
				System.out.println(name);
			}

		}
		inner obj = new inner();
		
		obj.hello();

	}

}
