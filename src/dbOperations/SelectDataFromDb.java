package dbOperations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataFromDb {
	
	public void getData() throws SQLException {
		
		

		DbConnection db = new DbConnection();
		Connection con = null;
		Statement statement = null;
		try {
			con = db.getDbConnection();
			String sql = "Select * from student";
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString("std_city"));
				System.out.println(rs.getString(4));
				System.out.println();
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
			
		}
		finally {
			
			if(statement != null) {
				
				statement.close();
				
			}
			
			if(con != null) {
				con.close();
			}
			
		}
		
	}
	
}
