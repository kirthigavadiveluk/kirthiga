package mycontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@RequestMapping("/bs2")
@SessionScope
public class BasicController1 {
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public void sayHello(HttpServletRequest request) {
		System.out.println("Say Hello Method"+request);
		HttpSession session=request.getSession();
		System.out.println("session..:"+session.getId());
		session.setAttribute("mykey","this is mykey value....");
		String str=session.getAttribute("mykey").toString();
		System.out.println("value..."+str);
	}
	@RequestMapping(method=RequestMethod.GET,value="/hello2")
	public void sayHello2(HttpSession session) {
		System.out.println("session..:"+session.getId());
		
		String str=session.getAttribute("mykey").toString();
		System.out.println("value..."+str);
	}
}
