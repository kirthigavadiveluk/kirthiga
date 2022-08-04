package com.example.demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class MyController {
	@Autowired
	private CustomerService service;

	public CustomerService getService() {
		return service;
	}

	public void setService(CustomerService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/forms1")
	public ModelAndView websearch1() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");

		return mv;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/forms1")
	public ModelAndView welcome1(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();

		String uname = request.getParameter("uname");

		String upass = request.getParameter("upass");

		System.out.println(uname + ":" + upass);

		List<Customer> c = service.checkUser(uname, upass);

		Iterator<Customer> itr = c.iterator();

		while (itr.hasNext()) {
			if (itr.next().getFlag() == 0) {
				mv.setViewName("welcome");
				service.updateFlag(1, uname, upass);
				return mv;
			} else {
				mv.setViewName("logout");
				return mv;
			}
		}
		mv.setViewName("error");
		return mv;

	}


	@RequestMapping(method = RequestMethod.POST, value = "/shop")
	public String shop(Customer cus,HttpServletRequest request) {


		Enumeration<String> em = request.getParameterNames();

		HttpSession hs = request.getSession();
	
		while (em.hasMoreElements()) {

			String a = em.nextElement().toString();

			String b = request.getParameter(a);

			hs.setAttribute(a, b);

		}
		return request.getParameter("shop");
	}


	
	
}
