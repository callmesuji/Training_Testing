package com.nttdata.com;

import java.io.FileWriter;

public class WritingFile {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("D:\\Demo\\hello.txt");
			writer.write("this is sujith");
			System.out.println("Successfully written inside file");
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
