package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbcon.DBConnection;
import dbcon.UserDTO;

public abstract class Action {
	
		public  abstract String execute(HttpServletRequest request,HttpServletResponse response );
	}
