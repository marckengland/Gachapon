import java.sql.*;

/**
 *
 * @author Marck England
 */
public class DBConnection {
	public Connection databaseLink;
	
	public Connection getConnection() {
		//String databaseName = "oop";
		String databaseUser = "sql12392742";
		String databasePassword = "jreWsaCtM8";
		String url = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12392742";
		
		System.out.println("Connected!");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
		} catch(Exception e) {
			e.printStackTrace();
			e.getCause();
		}
		
		System.out.println("DATABASE LINKED! " + databaseLink);
		return databaseLink;
	}
}