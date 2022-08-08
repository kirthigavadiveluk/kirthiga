package pack3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BlobandClob {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
		System.out.println("Entered.");
		
		String query = "insert into imagee(name,image) values (?, ?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, "Footer1");

		InputStream inputStream = new FileInputStream("C:/Images/aaa.png");

		pstmt.setBlob(2, inputStream);
		pstmt.execute();
		System.out.println("Record inserted......");
		
		
		
		// Retrieving the results
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * from imagee");
		while (rs.next()) {
			String name = rs.getString("name");

			Blob blob = rs.getBlob("image");
			System.out.println("Name: " + name);

			System.out.println("Blob value: " + blob);
			System.out.println("");
			System.out.print("blob data is stored at: ");
			// Storing clob to a file

		}
		if (rs.next()) {
			InputStream is = rs.getBinaryStream("photo");
			FileOutputStream fos = new FileOutputStream("C:/Images/Footer1.png");
			int bytesRead = 0;
			byte[] buffer = new byte[4096];
			while ((bytesRead = is.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			is.close();
			fos.close();
		}

		con.close();
		System.out.println("Image created");

	}

}
