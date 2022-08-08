package mycontroller;

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
@RequestMapping("/form1")
public class FormController {
	 @Autowired
	 MessageSource messageSource;
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public ModelAndView laodForm() {
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("userObj",new User());
		mandv.setViewName("userform");
		return mandv;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ModelAndView processForm(@Valid @ModelAttribute("userObj") User user,BindingResult result) {
		ModelAndView mandv=new ModelAndView();
		
		if(result.hasErrors()) {
			mandv.setViewName("userform");
		//	 FieldError customError =new FieldError("userObj","uname",messageSource.getMessage("mymessage", null, new Locale("ta")));
	    //   result.addError(customError);	           
			 return mandv;
		}
		else {
			System.out.println("Username...:"+user.getUname());
			user.setUname(user.getUname()+"anound technologies...");
			mandv.addObject("myuser",user);
			mandv.setViewName("welcome");
			return mandv;
		}
	}	
}
