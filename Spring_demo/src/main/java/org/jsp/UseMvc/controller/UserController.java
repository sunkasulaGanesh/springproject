package org.jsp.UseMvc.controller;


import org.jsp.UseMvc.dao.UserDao.UserDao;
import org.jsp.UseMvc.dto.User.User;
import org.jsp.UseMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value="u")
public class UserController {
	@Autowired
	private UserService UserService;

	@RequestMapping("/load")
	public ModelAndView load(ModelAndView view,@RequestParam int choice) {
		if(choice ==1)
		view.setViewName("register");
		if(choice==2)
			view.setViewName("edit");
		view.addObject("user", new User());
		return view;

	}

	@RequestMapping("/reg")
	public ModelAndView SaveUser(@ModelAttribute User user, ModelAndView view) {
		user = UserService.SaveUser(user);
		view.setViewName("display");
		view.addObject("message", "user saved with Id :- " + user.getId());
		return view;
	}
	
	@RequestMapping(value="/loginpage",method=RequestMethod.POST)
	public String login(@RequestParam long phone,@RequestParam String password,Model model) {
		User  user=UserService.verifyUser(phone,password);
		if(user!=null) {
			model.addAttribute("u",user);
			return "home";
		}
		else {
			model.addAttribute("message", "invalid phone number and password");
			return "login";
		}
	}
	@RequestMapping("/edit")
	public ModelAndView updateUser(@ModelAttribute User user,ModelAndView view) {
		user=UserService.UpdateUser(user);
		view.addObject("user", user);
		view.addObject("message", "invalid userphone & password");
		view.setViewName("display");
		return view;
	}
	@RequestMapping("/see")
	public ModelAndView view(ModelAndView view) {
		view.setViewName("view");
		return view;
		
	}
	

}
