package anoudpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Para")
public class Para extends HttpServlet {
	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()) {
			String pname=(String)e.nextElement();
			String pvalue=request.getParameter(pname);
			out.println(pname+":"+pvalue);
		
		}
		out.close();
	}

}
