package com.itwill.hello.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.itwill.hello.Hello;
import com.itwill.hello.HelloService;

public class HelloController implements Controller{
	/*
	 * Service 객체를 멤버필드로 가짐
	 */
	private HelloService helloService;
	
	
	public void setHelloService(HelloService helloService) {
		System.out.println("### HelloController");
		this.helloService = helloService;
	}
	public HelloController() {
		System.out.println("0.#### HelloController() 생성자");
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("A.### HelloController.handleRequest() 메쏘드호출");
		
		List<Hello> helloList=helloService.helloList();
		request.setAttribute("helloList", helloList);
		String forwardPath="forward:/WEB-INF/views/hello.jsp";
		ModelAndView mv=new ModelAndView();
		mv.setViewName(forwardPath);
		return mv;
	}

}