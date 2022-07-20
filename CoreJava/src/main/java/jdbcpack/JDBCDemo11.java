package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo11 {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="select * from users";
		Statement stmt=con.createStatement();
		boolean result=stmt.execute(sql);
		
		//step 4 - process result
		
		System.out.println(result);
	}
}