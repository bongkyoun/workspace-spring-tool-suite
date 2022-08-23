package com.itwill2.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;
import com.itwill.user.UserService;

public class SpringApplicationContextSetterInjection {

	public static void main(String[] args) throws Exception {
		System.out.println("----Spring Container초기화시작[ApplicationContext객체생성시작]");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("2.bean_setter_injection.xml");
		System.out.println("----Spring Container초기화끝[ApplicationContext객체생성끝]");
		System.out.println("-------GuestService---------");
		GuestService guestService=
				(GuestService)applicationContext.getBean("guestService");
		System.out.println("GuestService 객체 : "+guestService);
		System.out.println(guestService.selectAll());
		System.out.println(guestService.selectByNo(1));
		System.out.println("-------UserService---------");
		UserService userService=
				(UserService)applicationContext.getBean("userService");
		System.out.println("UserService 객체 : "+userService);
		System.out.println("-------기본형, String, 데이터 setter Injection---------");
		Guest guest=(Guest)applicationContext.getBean("guest");
		System.out.println(guest);
	
	}

}
