package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbcon.DBConnection;
import dbcon.UserDTO;

public class RegisterService extends Action{
	private UserDTO user;
	private DBConnection con;
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public DBConnection getCon() {
		return con;
	}
	public void setCon(DBConnection con) {
		this.con = con;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		user=new UserDTO();
		
		con=new DBConnection();
		
		user.setUname(request.getParameter("uname"));
		
		user.setUpass(request.getParameter("upass"));
		
		boolean a=con.registerUser(user);
		
		if(a) {
				
				return "Logout-Success";
				
			}
			
		else {
		
		return "Logout-Fail";
		
		}
	}
}
