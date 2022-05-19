package org.network;

public class Wifi {

	public static void main(String[] args) {

		Lan lan = new Lan();
		MobileData mobile_data = new MobileData();
		Wifi wifi = new Wifi();

		Wireless wireless = new Wireless();

		lan.lanName();
		mobile_data.dataName();
		wifi.wifiName();
		wireless.modamName();

	}

	public static void wifiName() {

	}

}
