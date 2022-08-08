package ServletPack;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Work.HeadWork;

public class ResponseWork {
	
public void process(HttpServletResponse response,HttpServletRequest request) {
		
		String path=request.getServletContext().getAttribute("path").toString();
		
		String action=request.getParameter("action");
		
		Properties prop=new Properties();
		
		try {
			
			prop.load(new FileInputStream(path));
		
		    String actionclass=prop.getProperty(action);
		
		    HeadWork work=(HeadWork)Class.forName(actionclass).getConstructor().newInstance();
		    
		    String getFun=work.working(response, request);
		    
		    String fun=prop.getProperty(getFun);
		    
		    RequestDispatcher rd=request.getRequestDispatcher(fun);
		    
		    rd.forward(request, response);
		
         } catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}



}

