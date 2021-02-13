import java.sql.*;

/**
 *
 * @author Marck England
 */
public class DBConnection {
	public Connection databaseLink;
	
	public Connection getConnection() {
		//String databaseName = "oop";
		String databaseUser = "tamaki_gachapon";
		String databasePassword = "Etwkn&a}zP7&";
		String url = "jdbc:mysql://johnny.heliohost.org:3306/tamaki_gachapondbz";
		
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