package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
public ResultSet checkTable(String TableName) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
			
			String query="select * from "+TableName;
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			
			
			return rs;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}

}
