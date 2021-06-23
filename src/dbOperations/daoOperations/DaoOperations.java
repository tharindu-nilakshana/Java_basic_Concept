package dbOperations.daoOperations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbOperations.DbConnection;

public class DaoOperations {

	//public static void main(String[] args) throws SQLException {
		public List<Student> getDbData() throws SQLException {
		DbConnection db = new DbConnection();
		Connection con = null;
		Statement statement = null;
		List<Student> studentInfoArray = null;
		
		
		try {
			con = db.getDbConnection();
			String sql = "Select * from student";
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			studentInfoArray = new ArrayList<Student>();
			
			
			while(rs.next()) {
				
				Student students = new Student();
				
				//set the data
				students.setStdId(rs.getInt(1));
				students.setStdName(rs.getString(2));
				students.setStdCity(rs.getString("std_city"));
				students.setStdcourse(rs.getString(4));
				
				studentInfoArray.add(students);
				
				
				
//				
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString("std_city"));
//				System.out.println(rs.getString(4));
//				System.out.println();
				
				
			}
			
			
			
			return studentInfoArray;
			
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
		
		return studentInfoArray;

	}

}
