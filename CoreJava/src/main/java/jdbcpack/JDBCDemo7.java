package jdbcpack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBCDemo7 {

	public static void main(String[] args)throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud","root","root");
		
		System.out.println(con);
		
		DatabaseMetaData dbmd=con.getMetaData();
		
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		
		System.out.println(dbmd.getUserName());
		
	}
}
