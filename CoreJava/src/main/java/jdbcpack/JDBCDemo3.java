package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDemo3 {

	public static void main(String[] args) throws Exception {
		// Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2 - Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");

		System.out.println(con);
		// Step 3 - Execute sql statement

		String sql = "update users set flag=? where uid=?";
		PreparedStatement stmt = con.prepareStatement(sql);

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the uid..:");
			int uid = scan.nextInt();
			System.out.println("Please enter the flag value..:");
			int flag = scan.nextInt();
			stmt.setInt(1, flag);
			stmt.setInt(2, uid);
			int noofrowschanged = stmt.executeUpdate();

			// step 4 - process result

			System.out.println("No of rows updated...:" + noofrowschanged);
		}
	}
}
