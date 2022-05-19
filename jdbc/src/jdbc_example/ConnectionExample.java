package jdbc_example;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionExample {

	public static void main(String[] args) {
		final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "username";
		final String PASS = "password";

		final String GET_STUDENT_DETAILS = "SELECT * FROM STUDENT";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement s = con.createStatement();
			System.out.println("Connection created successfully");
			ResultSet rs;
			rs = s.executeQuery(GET_STUDENT_DETAILS);
			while (rs.next()) {
				int i = 1;
				/*
				 * suppose if you have added new column (book_price) after (student_id) and you
				 * want to get values of book_price but assume there are 20 columns now
				 * book_price column index will be 2 and column index of student_id will be 3
				 * like that you need to update all the columns to get the result (or else) you
				 * can use one i variable and use increment operator and it will give same
				 * result
				 */

				int student_id = rs.getInt(1);
				int book_price = rs.getInt(2);
//				you need to change column index of student_name to 3 and book_id to 4 
				String student_name = rs.getString(2);
				int book_id = rs.getInt(3);

				/*
				 * int student_id = rs.getInt(i++);
				 * int book_price = rs.getInt(i++);
				 * String student_name = rs.getString(i++);
				 * int book_id = rs.getInt(i++);
				 */

				System.out.println(student_id + " " + student_name + " " + book_id);

			}

		} catch (Exception e) {

			System.out.println("unable to connect");
			e.printStackTrace();

		}

	}

}
