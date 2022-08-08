package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo9 {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="{call proc2(?,?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.setString(1, "tom");
		cs.setInt(2, 5);
		
		int noofchanges=cs.executeUpdate();
		//step 4 - process result
		
		System.out.println("No of changes..:"+noofchanges);
		
	}
}
