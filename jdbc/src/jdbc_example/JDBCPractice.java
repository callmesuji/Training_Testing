package jdbc_example;

import java.sql.*;
import java.util.Scanner;

public class JDBCPractice {

	public static void main(String[] args) {

		final String ADD_STUDENT = "INSERT INTO STUDENT(std_id,std_name,book_id) values (?,?,?)";
		final String SEARCH_BY_NAME = "SELECT * FROM STUDENT WHERE std_name = ?";
		final String SEARCH_BY_ID = "SELECT * FROM STUDENT WHERE std_id = ?";
		final String DELETE_BY_ID = "DELETE FROM STUDENT WHERE std_id = ?";
		final String UPDATE_BY_ID = "UPDATE STUDENT SET std_id = ?,std_name = ?,book_id = ? where std_id = ?";

		final String GET_ALL_STUDENTS = "SELECT * FROM STUDENT";

		final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "SUJITH KUMAR";
		final String PASS = "root";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement s = con.createStatement();
			ResultSet rs;
			PreparedStatement pst;

			Scanner sc = new Scanner(System.in);

			int rollno, bookid, flag;
			String name, q;

			while (true) {

				System.out.println("Enter your choice");
				System.out.println();

				System.out.println(
						"1.ADD STUDENT \t 2.SEARCH BY NAME \t 3.SEARCH BY ID \t 4.DELETE BY ROLL NO \t 5. UPDATE BY ROLL NO \t 6.DISPLAY ALL \t 7.EXIT");
				int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("Enter student  roll number ");
					rollno = sc.nextInt();
					System.out.println("Enter student  name");
					name = sc.next();
					System.out.println("Enter book id");
					bookid = sc.nextInt();

					pst = con.prepareStatement(ADD_STUDENT);

					pst.setInt(1, rollno);
					pst.setString(2, name);
					pst.setInt(3, bookid);
					int j = pst.executeUpdate();
					if (j > 0) {
						System.out.println("Student Added Succesfully");
					}
					break;
				case 2:
					System.out.println("ENTER STUDENT NAME TO SEARCH");
					name = sc.next();

					pst = con.prepareStatement(SEARCH_BY_NAME);

					pst.setString(1, name);
					rs = pst.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}
					break;

				case 3:/* Search by Student ID */
					System.out.println("Enter id to search");
					rollno = sc.nextInt();

					pst = con.prepareStatement(SEARCH_BY_ID);
					pst.setInt(1, rollno);
					rs = pst.executeQuery();

					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}

					break;
				case 4:
					/* delete by roll no */
					System.out.println("Enter id to Delete");
					rollno = sc.nextInt();

					pst = con.prepareStatement(DELETE_BY_ID);
					pst.setInt(1, rollno);
					int m = pst.executeUpdate();

				 
						System.out.println("Successfully deleted from the student table");
 

					break;
				case 5:/* update by roll no */
					System.out.println("Enter rollno to update record ");
					rollno = sc.nextInt();
					System.out.println("Enter updated roll no");
					int update_rollno = sc.nextInt();

					System.out.println("Enter updated name");
					name = sc.next();
					System.out.println("Enter updated book id");
					bookid = sc.nextInt();

					pst = con.prepareStatement(UPDATE_BY_ID);
					pst.setInt(1, update_rollno);
					pst.setString(2, name);
					pst.setInt(3, bookid);
					pst.setInt(4, rollno);

					int result = pst.executeUpdate();
					if (result > 0) {
						System.out.println("UPDATED SUCCESSFULLY");
					}

					break;
				case 6:
					/* display all records */

					rs = s.executeQuery(GET_ALL_STUDENTS);
					while (rs.next()) {
						int i = 1;
						int student_id = rs.getInt(1);
						String student_name = rs.getString(2);
						int book_id = rs.getInt(3);

						System.out.println(student_id + "\t" + student_name + "\t" + book_id);

					}

					break;
				case 7:
					System.out.println("EXITED SUCCESSFULLY");
					System.exit(0);
					break;

				default:
					System.out.println("Please Enter input from 1 to 7 only input only");
					break;
				}
			}

		} catch (

		Exception e) {
		}
	}

}
