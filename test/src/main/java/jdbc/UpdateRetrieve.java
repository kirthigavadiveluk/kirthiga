package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateRetrieve {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		

		String sql = "update users set flag=1";
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(sql);
		System.out.println("No of rows updated...:" + i);
		
		
		
		String sq = "select * from users";
		Statement sst = con.createStatement();
		ResultSet rs = sst.executeQuery(sq);
		while (rs.next()) {
			System.out.println(rs.getString("uname") + ":" + rs.getString("upass")+":"+rs.getInt("flag"));
		}
	}
}
