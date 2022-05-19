package interface_examples;

interface Drawable {
	void draw();

	static int Square(int n) {
		return n * n;
	}
}

class Square implements Drawable {

	@Override
	public void draw() {
		System.out.println("Draw method");

	}
}

public class StaticInterface {

	public static void main(String[] args) {

		Drawable obj = new Square();
		System.out.println(Drawable.Square(5));
		obj.draw();
	}

}
