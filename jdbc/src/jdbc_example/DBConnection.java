package jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;

	public Connection getConnection() {
		final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USERNAME = "SUJITH KUMAR";
		final String PASSWORD = "root";
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException s) {
			System.out.println(s.getMessage());
		}
		return conn;
	}

}
