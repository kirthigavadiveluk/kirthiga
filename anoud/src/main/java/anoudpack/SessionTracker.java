package anoudpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionTracker")
public class SessionTracker extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 HttpSession session=request.getSession();
		 Integer count=(Integer)session.getValue("tracker.count");
		 if(count==null)count=new Integer(1);
		 else count=new Integer(count.intValue()+1);
		 session.putValue("tracker.count",count);
		 out.println("<html><head><title>Session Tracker</title></head>");
		 out.println("<body><h1>Session Tracking Demo</h1>");
		 out.println("You've visited this page"+count+((count.intValue()==1)?"times.":"times."));
		 out.println("<p>");
		 out.println("<h2> Here is your session data:</h2>");
		 String []names=session.getValueNames();
		 for(int i=0;i<names.length;i++) {
			 out.println(names[i]+":"+session.getValue(names[i]+"<br>"));
		 }
		 out.println("</body></html>");
	 }
}