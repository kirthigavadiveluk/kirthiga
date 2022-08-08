package anoudpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
    public void init(ServletConfig config) throws ServletException {
    	   ServletContext app=config.getServletContext();
   		
   		System.out.println("From Second Servlet...:"+app.getAttribute("myglobal"));
   		try {
   		String path=app.getRealPath("/WEB-INF/config.properties");
   		Properties prop=new Properties();
   		prop.load(new FileInputStream(path));
   		System.out.println(prop.get("hello"));
   		}catch(Exception e) {
   			e.printStackTrace();
   		}
   		System.out.println(app.getRealPath(""));
    }
   
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
