package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwill.user.User;
import com.itwill.user.UserService;


@Controller
public class UserController {
	@Autowired
	UserService userService;
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
	@RequestMapping("/user_main")
	public String user_main() {
		return "user_main";
	}
	@RequestMapping("/user_write_form")
	public String user_write_form() {
		return "user_write_form";
	}
	
	
	@RequestMapping(value = "/user_write_action", method = RequestMethod.POST )
	public String user_write_action_post(@RequestParam String userId,
									@RequestParam String password,
									@RequestParam String name,
									@RequestParam String email , HttpServletRequest request) throws Exception{
		User user = new User(userId, password, name, email);
		int rowCount = userService.create(user);
		if(rowCount == -1) {
			request.setAttribute("fuser", user);
			request.setAttribute("msg", user.getUserId() +"는 존재하는 아이디 입니다.");
			System.out.println(user);
			return "user_write_form";
		}
		return "redirect:user_login_form";
	}
	@RequestMapping("/user_login_form")
	public String user_login_form() {
		return "user_login_form";
	}

	
	@RequestMapping(value = "/user_login_action", method = RequestMethod.POST)
	public String user_login_action_poset(@ModelAttribute(value = "fuser") User user, HttpServletRequest request) throws Exception{
		User loginUser = new User();
		
		int rowCount = userService.login(user.getUserId(), user.getPassword());
		if(rowCount == 0) {
			request.setAttribute("msg1", "등록된 아이디가 없습니다.");
			return "user_login_form";
		}
		if(rowCount == 1) {
			
			request.setAttribute("msg2", "비밀번호가 일치하지 않습니다.");
			
			return "user_login_form";
		}
		
		request.getSession().setAttribute("sUserId", user.getUserId());
		return "redirect:user_main";
	}
	@LoginCheck
	@RequestMapping("/user_logout_action")
	public String user_logout_action(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:user_main";
	}
	@LoginCheck
	@RequestMapping("/user_view")
	public String user_view(HttpServletRequest request) throws Exception{
		/********login check***********/
		User loginUser = userService.findUser((String)request.getSession().getAttribute("sUserId"));
		request.setAttribute("loginUser", loginUser);
		return "user_view";
	}
	@LoginCheck
	@RequestMapping("/user_modify_form")
	public String user_modify_form(HttpServletRequest request) throws Exception{
		/********login check***********/
		User user = userService.findUser((String)request.getSession().getAttribute("sUserId"));
		request.setAttribute("loginUser", user);
		return "user_modify_form";
	}
	@LoginCheck
	@RequestMapping(value = "/user_modify_action", method = RequestMethod.POST)
	public String user_modify_action_post(@ModelAttribute User user) throws Exception{
		/********login check***********/
		int rowCount = userService.update(user);
		
		return "redirect:user_view";
	}
	@LoginCheck
	@RequestMapping(value = "/user_remove_action", method = RequestMethod.POST)
	/********login check***********/
	public String user_remove_action(HttpServletRequest request) throws Exception{
		int rowCount = userService.remove((String)request.getSession().getAttribute("sUserId"));
		
		request.getSession().invalidate();
		return "user_main";
	}
	
	@RequestMapping(value = {"/user_write_action", "/user_login_action", "/user_modify_form", "/user_modify_action", "/user_remove_action"}, method = RequestMethod.GET)
	public String user_action_get() {
		return "redirect:user_main";
	}
	
	@ExceptionHandler(Exception.class)
	public String handle_exception(Exception e) {
		return "user_error";
	}
	
	
}
