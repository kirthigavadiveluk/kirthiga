package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbcon.DBConnection;

public class LogoutAction extends Action{
	public LogoutAction() {
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String name=request.getSession().getAttribute("uname").toString();

		
		DBConnection con=new DBConnection();
		
		boolean a=con.updateFlag(name, 0);
		
		if(a) {
			
			return "logout.Success";
			
		}else {
		
		return "logout.Fail";
		
		
		
		}
		
	}
}



