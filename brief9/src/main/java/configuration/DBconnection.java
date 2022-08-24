package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	private static String driver="org.postgresql.Driver";
	private static String dbURL = "jdbc:postgresql://localhost:5432/br8";
	private static String username = "postgres";
	private static String password = "admin";
	
	private static Connection conn = null;
	
	 
	public static Connection getconnect() {

			try {
				if(conn==null || conn.isClosed()) {
					try {
						Class.forName(driver);
				        conn = DriverManager.getConnection(dbURL, username, password);
				        System.out.println("Connected successfully.");
				    } catch (SQLException | ClassNotFoundException e) {
				        e.printStackTrace();
				    }
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
        return conn;
    }
	
	
}
