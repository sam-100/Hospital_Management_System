
import java.sql.*;

public class GetConnection {
	private static Connection conn = null;
	private GetConnection() {
		
	}
	public static Connection getConnection() {
		if(conn != null) {
			System.out.println("Returning existing connection");
			return conn;
		}
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/hospital";
			String username = "manager";
			String password = "1234";
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Got a new connection successfully!");
			return conn;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
