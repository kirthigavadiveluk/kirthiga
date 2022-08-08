package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo5 {

	public static void main(String[] args) throws Exception {
		// Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2 - Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");

		System.out.println(con);
		// Step 3 - Execute sql statement

		String sql = "select * from users where uname=?";
		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setString(1, "kavi");
		ResultSet rs = stmt.executeQuery();

		// step 4 - process result

		if (rs.next()) {
			System.out.println(rs.getInt("uid") + ":" + rs.getString("uname") + ":" + rs.getInt("amt"));
		}
	}

}
