package dbOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class DeleteUpdateOperation {

	public static void main(String[] args) throws SQLException {
		DbConnection db = new DbConnection();
		Connection con = null;
		Statement statement = null;
		
		try {
			
			con = db.getDbConnection();
			String updateSql = "Update student SET std_id=? where std_id=?";
			String deleteSql = "Delete from student where std_id=?";
			
			PreparedStatement updateStatment = con.prepareStatement(updateSql);
			PreparedStatement deleteStatment = con.prepareStatement(deleteSql);
			
			
//			updateStatment.setInt(1, 20);
//			updateStatment.setInt(2, 4);
			
			deleteStatment.setInt(1, 20);
			
			int effectedRows = deleteStatment.executeUpdate();
			
			System.out.println(effectedRows);
			
			
			
			
		} catch (Exception e) {
			
		}
		finally {
			con.close();
		}
		

	}

}
