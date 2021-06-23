package dbOperations.daoOperations;

import java.sql.SQLException;
import java.util.List;

public class DisplayData {

	public static void main(String[] args) throws SQLException {
		DaoOperations db = new DaoOperations();

		List<Student> list = db.getDbData();
		
		System.out.println(list);
		for(int i = 0; i< list.size();i++) {
			
			
//			Student std = list.get(i);
//			
//			System.out.println(std.getStdId());
//			System.out.println(std.getStdName());
//			System.out.println(std.getStdCity());
//			System.out.println(std.getStdcourse());
//			System.out.println();
			
			
			//using stream
			list.stream().forEach(std->{
				
				System.out.println(std.getStdId());
				System.out.println(std.getStdName());
				System.out.println(std.getStdCity());
				System.out.println(std.getStdcourse());
				System.out.println();
				
			});
			
		}

	}

}
