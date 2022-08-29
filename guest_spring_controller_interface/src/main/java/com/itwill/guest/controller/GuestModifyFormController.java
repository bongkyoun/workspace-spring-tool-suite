package com.itwill.guest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;
import com.itwill.guest.GuestServiceImpl;

public class GuestModifyFormController implements Controller {
	private GuestService guestService;
	public GuestModifyFormController() {
		System.out.println("### GuestModifyFormController()생성자 호출");
	}
	public void setGuestService(GuestService guestService) {
		System.out.println("### GuestModifyFormController : setGuestService("+guestService+") 메쏘드 호출");
		this.guestService = guestService;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String forwardPath="";
		ModelAndView mv=new ModelAndView(forwardPath);
		return mv;
	}

}
