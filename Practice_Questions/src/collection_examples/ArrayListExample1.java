package collection_examples;

import java.util.ArrayList;

class car {
	public int carno;
	public String color;
	public String model;
	public String company;

	public car() {
		super();
	}

	public car(int carno, String color, String model, String company) {
		super();
		this.carno = carno;
		this.color = color;
		this.model = model;
		this.company = company;
	}

	public int getCarno() {
		return carno;
	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "car [carno=" + carno + ", color=" + color + ", model=" + model + ", company=" + company + "]";
	}

}

public class ArrayListExample1 {

	public static void main(String[] args) {

		ArrayList<car> arrlist = new ArrayList<>();

		car c1 = new car(1010, "red", "SUV", "Mahindra");
		car c2 = new car(1010, "black", "SLS", "Mercedes Benz");
		car c3 = new car(1010, "white", "CHIRON", "Bugatti");

		arrlist.add(c1);
		arrlist.add(c2);
		arrlist.add(c3);

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist);
		}
		for (car c : arrlist) {
			System.out.println(c);

		}

	}

}
