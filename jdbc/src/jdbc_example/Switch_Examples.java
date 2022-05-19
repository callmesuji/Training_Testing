package jdbc_example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Switch_Examples {

	public static void main(String[] args) throws SQLException {
		final String ADD_Student = "INSERT INTO STUDENT(std_id,std_name,book_id) values (?,?,?)";
		final String GET_STUDENTS = "SELECT * FROM STUDENT";
		DBConnection db = new DBConnection();
		Connection con = null;
		PreparedStatement pst = null;
		Statement st = null;
//		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("1.add 2.search");
		System.out.println("Enter your choice");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter roll number ");
			int rollno = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter book id");
			int id = sc.nextInt();
//			st.execute(ADD_Student);
			System.out.println("inserted into database successfully");

			break;
		case 2:
		 
			ResultSet rs = st.executeQuery(GET_STUDENTS);
			while (rs.next()) {
				int i = 1;
				int student_id = rs.getInt(1);
//				int book_price = rs.getInt(2);
				String student_name = rs.getString(2);
				int book_id = rs.getInt(3);

				System.out.println(student_id + " " + student_name + " " + book_id);

			}
		case 3:
			/* search by student id */
			break;
		case 4:
			/* delete by roll no */
			break;
		case 5:/* update by roll no */
			break;
		case 6:
			/* display all records */
			break;

		default:
			break;
		}

	}

}
