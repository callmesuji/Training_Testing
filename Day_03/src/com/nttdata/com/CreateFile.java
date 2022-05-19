package com.nttdata.com;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		File file = new File("D:\\Demo\\hello.txt");
		try {
			if (file.createNewFile())
				System.out.println("file created successfully");
			else
				System.out.println("unable to create file");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
