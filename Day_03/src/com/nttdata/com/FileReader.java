package com.nttdata.com;

import java.io.File;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\Demo\\hello.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
