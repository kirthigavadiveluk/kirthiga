package dataBaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon {

public DBCon() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public String findTaxi(String pickupstation){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select * from taxitable order by eamt ASC";
			
			Statement ps=con.createStatement();
			
			ResultSet rs=ps.executeQuery(query);
			
			while(rs.next()) {
				
				if(rs.getInt("flag")==0 && rs.getString("station").equals(pickupstation)) {
			            
			            return rs.getString(1);
			            
				}
			
			
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
		return null;
		
	}
	
	public int findStationNumber(String pickupstation) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select sno from taxivalues where station=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, pickupstation);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getInt(1);
			
			}else {
				
				return 0;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public String findStationName(int sno) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select station from taxivalues where sno=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, sno);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getString(1);
			
			}else {
				
				return null;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public int findStationDistance(String pickupstation) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select distance from taxivalues where station=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, pickupstation);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getInt(1);
			
			}else {
				
				return 0;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public int checkMoney(String Taxiname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select eamt from taxitable where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, Taxiname);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getInt(1);
			
			}else {
				
				return 0;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public int calculateAddedMoney(int startdistance,int enddistance) {
		
		int a=Math.max(startdistance, enddistance);
		
		int b=Math.min(startdistance, enddistance);
		
		int c=a-b;
		
		int d=((c-5)*10)+100;
		
		return d;
		
	}
	
	public boolean updateMoney(int calculateAddedMoney, int checkMoney,String taxiname) {
		
		int a=calculateAddedMoney+checkMoney;
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="update taxitable set eamt=? where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, a);
			
			ps.setString(2, taxiname);
			
			ps.execute();
			
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean updateFlag(String taxiname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="update taxitable set flag=? where taxiname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, 1);
			
			ps.setString(2, taxiname);
			
			ps.execute();
			
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public int checkTime(String startpoint) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select time from taxivalues where station=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, startpoint);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getInt(1);
			
			}else {
				
				return 0;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public int calculateAddedTime(int starttime,int endtime) {
		
		int a=Math.max(starttime, endtime);
		
		int b=Math.min(starttime, endtime);
		
		return a-b;
		
	}
	
	public boolean updateCustomerInfo(String customerid, String taxiname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="insert into taxicustomers values(?,?)";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, customerid);
			
			ps.setString(2, taxiname);
			
			ps.execute();
			
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public String findCustomerTaxi(String customerid) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			String query="select taxiname from taxicustomers where tid=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, customerid);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return rs.getString(1);
			
			}else {
				
				return null;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		DBCon db=new DBCon();
		
		System.out.println(db.findTaxi("B"));
		
		System.out.println(db.findStationNumber("C"));
		
		System.out.println(db.findStationName(5));
		
		System.out.println(db.findStationDistance("C"));
		
		System.out.println(db.checkMoney("Taxi-2"));
		
		System.out.println(db.calculateAddedMoney(15, 30));
		
		System.out.println(db.updateMoney(25, 10, "Taxi-1"));
		
		System.out.println(db.updateFlag("Taxi-1"));
		
		//System.out.println(db.updateCustomerInfo("1", "Taxi-1"));
		
		System.out.println(db.findCustomerTaxi("1"));
		
	}

}
