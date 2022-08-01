package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/myc")
public class MyController {
	
	@Autowired
	private StudentService service;
	
	
	public StudentService getService() {
		return service;
	}
	public void setService(StudentService service) {
		this.service = service;
	}
	@RequestMapping(method=RequestMethod.GET, value = "/create")
	public void create() {
		System.out.println("saving student object...");
		Student student=new Student();
		student.setSid(600);
		student.setSname("Gomathi");
		student.setScity("ooty");
		student.setSage(27);
		
		service.saveStudent(student);
		System.out.println("student object saved...........");
	}
		@RequestMapping(method = RequestMethod.GET,value="/display")
		public void displayStudent(@RequestParam("name") String name) {
			List<Student> list=service.getStudent(name);
			System.out.println("Student list........."+list);
			Iterator<Student> iter=list.iterator();
			while(iter.hasNext()) {
				Student str=(Student)iter.next();
				System.out.println("Student...."+iter);
				System.out.println(str.getSname()+"..."+str.getScity());
			}
		}

			
			@RequestMapping(method = RequestMethod.GET,value="/show")
			public void displayage(@RequestParam("age") int age) {
				List<Student> list=service.getage(age);
				System.out.println("Student list........."+list);
				Iterator<Student> iter=list.iterator();
				while(iter.hasNext()) {
					Student str=(Student)iter.next();
					System.out.println("Student...."+iter);
					System.out.println(str.getSname()+"..."+str.getSage());
				}
	}
			@RequestMapping(method = RequestMethod.GET,value="/do")
			public ModelAndView met2(@RequestParam("city") String city,HttpServletRequest request) {
					
					ModelAndView mv=new ModelAndView();
					
					List<Student> l=service.getScity(city);
					
					Iterator<Student> itr=l.iterator();
					
					System.out.println(l);
					
					String s="";
					
					while(itr.hasNext()) {
						
						String ss=itr.next().getScity();
						
						if(ss!=null) {
							
							s=s+","+ss;
							
						}
						
						System.out.println(ss);
						
					}
					
					System.out.println(s);
					
					request.setAttribute("names", s);
					
					mv.setViewName("myjsp");
					
					return mv;
	}
}
