package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args)throws Exception {
		//Step1 - Load the Driver.
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish Connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/anoud","root","root");
				
				System.out.println(con);
				//Step 3 - Execute sql statement
				
				String sql="update users set flag=0";
				Statement stmt=con.createStatement();
				int noofrowschanged=stmt.executeUpdate(sql);
				
				//step 4 - process result
				
				System.out.println("No of rows updated...:"+noofrowschanged);
				String sq="select * from users";
				Statement st=con.createStatement();
				
				ResultSet rs=st.executeQuery(sq);
				
				//step 4 - process result
				
				while(rs.next()) {
					System.out.println(rs.getInt("uid")+":"+rs.getString("uname"));
				}
			}
		}
