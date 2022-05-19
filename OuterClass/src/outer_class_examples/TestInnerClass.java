package outer_class_examples;

public class TestInnerClass {

	public static void main(String[] args) {

//		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		OuterClass outer = new OuterClass();

		OuterClass.InnerClass inner = outer.new InnerClass();

		inner.show();

	}

}
