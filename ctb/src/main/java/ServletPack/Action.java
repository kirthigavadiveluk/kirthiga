package ServletPack;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Action extends HttpServlet {
	ResponseWork rw;

	@Override
	public void init(ServletConfig config) throws ServletException {
		rw = new ResponseWork();

		String path = config.getServletContext().getRealPath("/WEB-INF/config.properties");

		config.getServletContext().setAttribute("path", path);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		rw.process(response, request);
	}

	@Override
	public void destroy() {
		System.out.println("The Old is Deleted...............");
	}
}
