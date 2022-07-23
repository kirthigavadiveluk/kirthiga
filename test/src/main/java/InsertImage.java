import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage {
	
	public static void main(String[] args) throws Exception{
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
			
			System.out.println(con);
			
			String qury="insert into toyshop2 values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setString(1, "Car");
			
			FileInputStream fis=new FileInputStream("C://Users//muthukumar.m//Downloads/car.jpg");
			
			ps.setBinaryStream(3, fis, fis.available());
			
			ps.setString(2, "20");
			
			int a=ps.executeUpdate();
			
			System.out.println(a);
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
}
