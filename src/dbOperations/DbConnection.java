package dbOperations;
import java.sql.*;
public class DbConnection {

	public Connection getDbConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/student_info";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("Work...");
			}
			else {
				System.out.println("Not Work...");
			}
	
		return con;
		
	}
	
}
