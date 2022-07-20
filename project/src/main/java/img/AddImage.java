package img;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/AddImage")
public class AddImage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("add image in db");
		Part file=request.getPart("image");
		String imageName=file.getName();
		String imageFileName=file.getSubmittedFileName();
		System.out.println("Selected image name"+imageName+"Selected image file name :"+imageFileName);
			String uploadPath="C:/kirthiga/bin/project/images/"+imageFileName;
			System.out.println(uploadPath);
			
			try {
				FileOutputStream fos=new FileOutputStream(uploadPath);
				InputStream is=file.getInputStream();
				byte[] data=new byte[is.available()];
				is.read(data);
				fos.write(data);
				fos.close();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			Connection con=null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
				PreparedStatement ps;
				String query="insert into image(imageName,imageFileName) values(?,?)";
				ps=con.prepareStatement(query);
				ps.setString(1,imageName);
				ps.setString(2,imageFileName);
				int row=ps.executeUpdate();
				if(row>0) {
					System.out.println("Image Row Updated..");
				}else {
					System.out.println("not uploaded...");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
