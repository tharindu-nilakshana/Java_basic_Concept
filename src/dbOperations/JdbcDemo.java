package dbOperations;

import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		
		SelectDataFromDb sd = new SelectDataFromDb();
		sd.getData();
	}

}
