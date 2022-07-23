package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean checkUser(String uname, String upass) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
			PreparedStatement ps=con.prepareStatement("select*from users where uname=? and upass=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
			
			
		}catch(Exception e) {
				e.printStackTrace();
				return false;
		}

	}
	public boolean updateFlag(String uname, int flag) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
			PreparedStatement ps = con.prepareStatement("update users set flag=? where uname=?");
			ps.setInt(1, flag);
			ps.setString(2, uname);
			int i=ps.executeUpdate();
			if(i!=0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean checkFlag(String uname) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
			PreparedStatement ps=con.prepareStatement("select flag from users where uname=?");
			ps.setString(1, uname);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int a=rs.getInt(1);
				if(a==0) {
					return true;
				}
				else {
					return false;
					
				}
			}
			else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}
}
