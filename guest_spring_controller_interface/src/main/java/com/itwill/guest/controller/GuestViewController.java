package com.itwill.guest.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestViewController implements Controller{
	private GuestService guestService;
	public GuestViewController() {
		System.out.println("### GuestViewController()생성자 호출");
	}
	public void setGuestService(GuestService guestService) {
		System.out.println("### GuestViewController : setGuestService("+guestService+") 메쏘드 호출");
		this.guestService = guestService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String forwardPath="";
		ModelAndView mv=new ModelAndView(forwardPath);
		return mv;
	}

}
