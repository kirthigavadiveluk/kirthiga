package com.example.demo;

import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	public ModelAndView registers(Customer cus, HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");

		return mv;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/forms1")
	public ModelAndView websearch1(@ModelAttribute("user") Customer cus, HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();

		mav.addObject("uname", cus.getUname());

		mav.addObject("upass", cus.getUpass());

		String uname = cus.getUname(), upass = cus.getUpass();

		List<Customer> c = service.checkUser(uname, upass);

		Iterator<Customer> itr = c.iterator();

		while (itr.hasNext()) {

			if (itr.next().getFlag() == 0) {

				mav.setViewName("welcome");
				service.updateFlag(1, uname, upass);
				return mav;
			} else {

				mav.setViewName("logout");
				return mav;

			}

		}

		mav.setViewName("error");
		return mav;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/shop")
	public String shop(Customer cus, HttpServletRequest request) {

		Enumeration<String> em = request.getParameterNames();

		HttpSession hs = request.getSession();

		while (em.hasMoreElements()) {

			String a = em.nextElement().toString();

			String b = request.getParameter(a);

			hs.setAttribute(a, b);

		}
		return request.getParameter("shop");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/shopimg")
	public void met(HttpServletRequest request, HttpServletResponse response) {

		response.setContentType("image/jpg");
		String name = request.getParameter("name");
		String shopname = request.getParameter("shopname");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
			String sql = "SELECT * FROM " + shopname + " WHERE name =?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				byte[] imageData = rs.getBytes("img");
				OutputStream os = response.getOutputStream();
				os.write(imageData);
				os.flush();
				os.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public ModelAndView websearch() {

		ModelAndView mav = new ModelAndView();
		Customer cus = new Customer();
		cus.setFlag(0);
		int a = cus.getUid() + 1;
		cus.setUid(a);
		mav.addObject("user", cus);
		mav.setViewName("register");
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ModelAndView processFrom(@Valid @ModelAttribute("user") Customer cus, BindingResult rs,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		if (rs.hasErrors()) {
			mav.setViewName("register");
			return mav;
		} else {
			System.out.println("Username...:" + cus.getUname());
			String upass = request.getParameter("upass");
			String pass1 = request.getParameter("pass1");
			if (upass.equals(pass1)) {
				List<Customer> c = service.checkuid(cus);
				Iterator<Customer> itr = c.iterator();
				int b = 0;
				while (itr.hasNext()) {
					b = itr.next().getUid();
				}
				System.out.println(b);
				cus.setUid(b + 1);
				cus.setUpass(upass);
				mav.addObject("user", cus);
				service.saveData(cus);
				mav.setViewName("login");
				return mav;
			} else {

				mav.setViewName("error");

				return mav;

			}
		}
	}

}
