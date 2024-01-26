package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() throws SQLException {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String password = "";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("success!");
		} catch (ClassNotFoundException e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	
		return connection;
	}

}
