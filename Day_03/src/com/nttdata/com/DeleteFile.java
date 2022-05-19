package com.nttdata.com;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\Demo\\hello.txt");
			if (f.delete())
				System.out.println("file deleted successfully");
			else
				System.out.println("file was unable to delete");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
