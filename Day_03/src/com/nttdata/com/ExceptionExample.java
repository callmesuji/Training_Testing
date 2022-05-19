package com.nttdata.com;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			String s = "hello hi";
			int i = Integer.parseInt(s);
			String b = null;
			System.out.println(b.length());// NullPointerException */
			int num = 10;
			int den = 0;
			int result = num / den;
			System.out.println("result" + result);
			double a[] = new double[5];
			a[10] = 50.2;
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (NullPointerException e) {
			System.out.println("nullpointer Exception occurs");
		} catch (NumberFormatException e) {
			System.out.println("numberformat Exception occurs");
		}

		catch (Exception e) {
			System.out.println("Exception occured" + e);
			/* System.out.println(e.getMessage()); */
			/* e.printStackTrace(); */
		}
		finally {
			System.out.println("hello");
		}

	}

}
