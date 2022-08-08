package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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
	MessageSource message;
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch() {

		ModelAndView mv = new ModelAndView();

		UserDTO d = new UserDTO();

		d.setFlag(0);

		int a = d.getUid() + 1;

		d.setUid(a);

		mv.addObject("user", d);

		mv.setViewName("register");

		return mv;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/forms")
	public ModelAndView welcome(@Valid @ModelAttribute("user") UserDTO d,
			BindingResult br,HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		
		if (br.hasErrors()) {
			mv.setViewName("register");
			return mv;
		} else {
			System.out.println(d.getName());
			String pass = request.getParameter("pass");
			String pass1 = request.getParameter("pass1");
			if (pass.equals(pass1)) {

				List<UserDTO> a = service.checkuid(d);
				Iterator<UserDTO> itr = a.iterator();
				int b = 0;
				while (itr.hasNext()) {
					b = itr.next().getUid();
				}
				System.out.println(b);
				d.setUid(b + 1);
				d.setPass(pass1);
				mv.addObject("user", d);
				service.saveData(d);
				mv.setViewName("welcome");
				return mv;
			} else {
				mv.setViewName("error");
				return mv;
			}
		}
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

		String name = request.getParameter("name");

		String pass = request.getParameter("pass");

		System.out.println(name + ":" + pass);

		List<UserDTO> c = service.checkUser(name, pass);

		Iterator<UserDTO> itr = c.iterator();

		while (itr.hasNext()) {

			mv.setViewName("welcome");

			return mv;

		}

		mv.setViewName("error");

		return mv;

	}
}
