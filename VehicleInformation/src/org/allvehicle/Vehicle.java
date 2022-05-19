package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		TwoWheller twowheeler = new TwoWheller();
		ThreeWheeler threeWheeler = new ThreeWheeler();
		FourWheeler fourWheeler = new FourWheeler();

		vehicle.VehicleNecessery();
		twowheeler.bike();
		twowheeler.cycle();

		threeWheeler.Auto();
		FourWheeler.car();
		FourWheeler.bus();
		FourWheeler.lorry();

	}

	public static void VehicleNecessery() {

	}

}
