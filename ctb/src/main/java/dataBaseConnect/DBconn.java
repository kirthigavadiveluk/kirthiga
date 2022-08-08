package dataBaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconn {
public DBconn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public boolean CheckFlag(){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select * from taxitable";
			
			Statement ps=con.createStatement();
			
			ResultSet rs=ps.executeQuery(query);
			
			while(rs.next()) {
				
				while(rs.getInt("flag")==0) {
					
					return true;
					
				}
			
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
		return false;
		
	}
	
	public int CheckStation(String station) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select sno from taxivalues where station=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getInt("sno");
			
			}else {
				
				return 0;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public boolean UpdateStation(String station,String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="update taxitable set station=? where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
			ps.setString(2, tname);
			
			int rs=ps.executeUpdate();
			
			if(rs!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean UpdateFlag(String tname,int flag){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="update taxitable set flag=? where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, flag);
			
			ps.setString(2, tname);
			
			int rs=ps.executeUpdate();
			
			if(rs!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean CheckMoney(String tname){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select eamt from taxitable where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, tname);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean UpdateMoney(int amt,String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="update taxitable set eamt=? where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, amt);
			
			ps.setString(2, tname);
			
			int rs=ps.executeUpdate();
			
			if(rs!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	
	public boolean CheckTable(){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select * from taxitable order by eamt ASC";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean CheckTime(String station){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select time from taxivalues where station=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean CheckDistance(String station){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select distance from taxivalues where station=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean BookTaxi(String station){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select * from taxitable order by eamt ASC";
			
			Statement ps=con.createStatement();
			
			ResultSet rs=ps.executeQuery(query);
			while(rs.next()) {
				
				if(rs.getInt("flag")==0 && rs.getString("station").equals(station)) {
			            System.out.println(rs.getInt(4));
			            return true;
				}
			
			
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		DBconn db=new DBconn();
		
		System.out.println(db.UpdateStation("A","Taxi-2"));
		
		System.out.println(db.UpdateFlag("Taxi-4", 0));
		
		System.out.println(db.CheckStation("C"));
		
		System.out.println(db.CheckFlag());
		
		System.out.println(db.CheckMoney("Taxi-2"));
		
		System.out.println(db.CheckTime("C"));
		
		System.out.println(db.CheckDistance("C"));
		
		System.out.println(db.UpdateMoney(45, "Taxi-4"));
		
		System.out.println(db.BookTaxi("A"));
		
		System.out.println(db.CheckTable());
		
	}

}