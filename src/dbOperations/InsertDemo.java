package dbOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws SQLException {
		
		DbConnection db = new DbConnection();
		Connection con = null;
		Statement statement = null;
		int stdId = 0;
		String stdName = "";
		String stdCity = "";
		String stdCourse = "";
		try {
			
			con = db.getDbConnection();
			
			stdId = 11;
			stdName = "Keshani";
			stdCity = "Matara";
			stdCourse = "ICT";
			
			//String sql = "Insert into student values ('"+stdId+"','"+stdName+"','"+stdCity+"','"+stdCourse+"')";
			
			 //statement = con.createStatement();
			 //statement.executeQuery(sql);
			
			//we can avoid sql injection using prepared statements 
			String sql = "Insert into student values (?,?,?,?)";
			PreparedStatement statements = con.prepareStatement(sql);
			
			statements.setInt(1, stdId);
			statements.setString(2, stdName);
			statements.setString(3, stdCity);
			statements.setString(4, stdCourse);
			
			

			int effectedRows = statements.executeUpdate();
			
			System.out.println(effectedRows);
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
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
