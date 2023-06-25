package org.jsp.UseMvc.controller;

import javax.servlet.http.HttpSession;

import org.jsp.UseMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogOutController {
	@Autowired
	UserService UserService;
	@RequestMapping("/logout")
	public String logout(HttpSession session,Model model) {
		session.invalidate();
		model.addAttribute("message", "logged out");
		return "login";
		
	}
	@RequestMapping("/delete")
	public ModelAndView delete(HttpSession session,@RequestParam int id,ModelAndView view) {
		UserService.deleteUser(id);
		session.invalidate();
		view.setViewName("display");
		view.addObject("message", "user is deleted..");
		return view;
		
	}

}
