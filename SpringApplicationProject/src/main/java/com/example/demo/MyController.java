package com.example.demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch() {

		ModelAndView mv = new ModelAndView();

		Customer cus= new Customer();

		cus.setFlag(0);

		int a = cus.getUid() + 1;

		cus.setUid(a);

		mv.addObject("user",cus);

		mv.setViewName("register");

		return mv;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/forms")
	public ModelAndView welcome(@Valid @ModelAttribute("user") Customer cus,
			BindingResult br,HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		
		if (br.hasErrors()) {
			mv.setViewName("register");
			return mv;
		} else {
			System.out.println(cus.getUname());
			String upass = request.getParameter("upass");
			String pass1 = request.getParameter("pass1");
			if (upass.equals(pass1)) {

				List<Customer> a = service.checkuid(cus);
				Iterator<Customer> itr = a.iterator();
				int b = 0;
				while (itr.hasNext()) {
					b = itr.next().getUid();
				}
				System.out.println(b);
				cus.setUid(b + 1);
				cus.setUpass(pass1);
				mv.addObject("user", cus);
				service.saveData(cus);
				mv.setViewName("login");
				return mv;
			} else {
				mv.setViewName("error");
				return mv;
			}
		}
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

			mv.setViewName("welcome");

			return mv;

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

	@RequestMapping(method = RequestMethod.GET, value = "/forms2")
	public ModelAndView logout(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String uname = request.getParameter("uname");

		String upass = request.getParameter("upass");
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
	
	
}
