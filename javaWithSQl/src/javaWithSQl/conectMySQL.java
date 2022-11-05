package javaWithSQl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.ClientPreparedStatement;
import com.mysql.cj.protocol.Resultset;

public class conectMySQL {
	private static String DB_URL = "jdbc:mysql://localhost:3306/dtb";
	private static String USER_NAME = "root";
	private static String PASSWORD = "";

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connect successfully!");
			String sql = "select * from student";
			PreparedStatement pr = conn.prepareStatement(sql);
			ResultSet r1 = pr.executeQuery();
			while (r1.next()) {
				System.out.print(r1.getInt(1) + "-");
				System.out.print(r1.getString(2) + "-");

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
