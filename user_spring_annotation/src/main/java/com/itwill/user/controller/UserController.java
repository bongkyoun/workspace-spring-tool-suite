package com.itwill.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import com.itwill.user.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController() {
	
	}
	@RequestMapping("/user_main")
	public String user_main() {
		return "forward:/WEB-INF/views/user_main.jsp";
		//forward:/WEB-INF/views/guest_main.jsp
		//redirect:user_main.do
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	/user_main
	/user_write_form
	/user_write_action
	/user_login_form
	/user_login_action
	/user_logout_action
	/user_view
	/user_modify_form
	/user_modify_action
	/user_remove_action
	*/
}
