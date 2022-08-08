package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		

		Statement st = con.createStatement();
		String crt = "create table users(" + "uname varchar(20)," + "upass varchar(6)," + "flag int(1))";
		//st.execute(crt);
		System.out.println("table created...");

	}

}
