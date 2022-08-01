package mycontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bs3")
@SessionAttributes({"myobj"})
public class BasicController2 {
	@RequestMapping(method = RequestMethod.GET, value = "/basic")
	public String sayHelloBasic() {
		return "home";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayHello(HttpServletRequest request, Model model) {
		request.setAttribute("myobj", "this is request added value....");
		model.addAttribute("myobj", "this is session value added in hello1...");
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello1")
	public String sayHello2(Model model) {
		model.addAttribute("myobj", "this is from hello1................");
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello2")
	public ModelAndView sayHello3() {
		ModelAndView mandv = new ModelAndView();
		mandv.addObject("myobj", "this is obj value.....");
		mandv.setViewName("home");
		return mandv;
	}
}
