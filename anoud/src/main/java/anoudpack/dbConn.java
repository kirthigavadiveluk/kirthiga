package anoudpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConn {
	private ResultSet rs = null; // RecordSet Variable
	private Connection con = null;

	public String setData(String name, int age) {
		String sqlInsSt = "INSERT INTO emp VALUES('" + name + "'," + age + ")";
		int n = 0;
		if (con == null) // if Connection has not been set
			return "Connection failed";

		try {
			Statement s = con.createStatement();
			n = s.executeUpdate(sqlInsSt);
		} catch (SQLException e) {
			System.out.println(e);
		} // if a SQL error occurs

		if (n != 0)
			return "Data is successfully inserted";
		else
			return "Data insertion is failed";
	}

	public ResultSet getData() {
		String sqlStatement = "SELECT name, age FROM emp";
		ResultSet temp = executeQuery(sqlStatement);
		return temp;
	}

	public ResultSet executeQuery(String stmt) {
		if (con == null) // if Connection has not been set
			rs = null;
		else {
			try {
				Statement s = con.createStatement();
				rs = s.executeQuery(stmt);
			} catch (SQLException e) {
				System.out.println(e);
			} // if a SQL error occurs
		}
		return (rs);
	}

	public String DBConnect() {
		String retVal = ""; // there are no errors yet
		// Connection conn = null;
		try // try to connect to the database
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		}
		// if the driver class isn't found
		catch (ClassNotFoundException e) {
			retVal = e.toString();
		} catch (SQLException e) {
			retVal = e.toString();
		} // if a SQL error occurs

		return (retVal); // returns error messages or an empty string
							// that the caller must print.
	}
}
