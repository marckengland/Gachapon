import java.sql.*;

/**
 *
 * @author Marck England
 */
public class DBConnection {
	public Connection databaseLink;
	
	public Connection getConnection() {
		//String databaseName = "oop";
		String databaseUser = "root";
		String databasePassword = "";
		String url = "jdbc:mysql://localhost/gachapondb";
		
		System.out.println("Nice!");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
		} catch(Exception e) {
			e.printStackTrace();
			e.getCause();
		}
		
		System.out.println("DATABASE LINK: " + databaseLink);
		return databaseLink;
	}
}