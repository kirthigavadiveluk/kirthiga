package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish Connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/anoud","root","root");
				
				System.out.println(con);
				//Step 3 - Execute sql statement
				
				//step 4 - process result
			}
		}