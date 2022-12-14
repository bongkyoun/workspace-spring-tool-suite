package com.itwill.shop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.itwill.shop.cart.CartItem;
import com.itwill.shop.cart.CartService;
import com.itwill.shop.controller.interceptor.LoginCheck;
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	@Autowired
	private CartService cartService;
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping(value = "/account-login")
	public String user_login_form() {
		return "account-login";
	}
	/*
	 * 회원 로그인
	 */
	@PostMapping(value = "/account-login")
	public String user_login_action_post(@ModelAttribute User user,HttpSession session,Model model) throws Exception{
		String forwardPath="";
		int result = userService.login(user.getUserId(), user.getPassword());
		if(result==0) {
			//아이디존재안함
			model.addAttribute("msg1", user.getUserId()+" 는 존재하지않는 아이디입니다.");
			model.addAttribute("fuser", user);
			forwardPath="account-login";
		}else if(result==1) {
			//패쓰워드 불일치
			model.addAttribute("msg2", "패쓰워드가 일치하지 않습니다");
			model.addAttribute("fuser", user);
			forwardPath="account-login";
		}else if(result==2) {
			//로그인성공
			session.setAttribute("sUserId", user.getUserId());
			forwardPath="redirect:index";
		}
		return forwardPath;
	}
	/*
	 * 회원 로그아웃
	 */
	@LoginCheck
	@RequestMapping(value = "/account-logout")
	public String user_logout_action(HttpSession session) {
		session.invalidate();
		return "redirect:index";
	}
	/*
	 * 회원 배송지주소
	 */
	@LoginCheck
	@RequestMapping(value = "/account-address")
	public String user_view_address(HttpSession session,Model model) throws Exception {
		String sUserId=(String)session.getAttribute("sUserId");
		User loginUser=userService.findUser(sUserId);
		List<Product> productList=productService.getProductList();
		List<CartItem> cartItemList = cartService.getCartList(sUserId);
		int cartTotPrice=0;
		for (CartItem cartItem : cartItemList) {
				cartTotPrice+=cartItem.getProduct().getP_price()*cartItem.getCart_qty();
		}
		List<Order> orderList=orderService.list(sUserId);
		
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("cartTotPrice", cartTotPrice);
		model.addAttribute("productList", productList);
		model.addAttribute("orderList", orderList);
		
		return "account-address";
	}
	/*
	 * 회원 정보
	 */
	@LoginCheck
	@RequestMapping(value = "/account-profile")
	public String user_view_myinfo(HttpSession session,Model model) throws Exception {
		String sUserId=(String)session.getAttribute("sUserId");
		User loginUser=userService.findUser(sUserId);
		List<Product> productList=productService.getProductList();
		List<CartItem> cartItemList = cartService.getCartList(sUserId);
		int cartTotPrice=0;
		for (CartItem cartItem : cartItemList) {
			cartTotPrice+=cartItem.getProduct().getP_price()*cartItem.getCart_qty();
		}
		List<Order> orderList=orderService.list(sUserId);
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("cartTotPrice", cartTotPrice);
		model.addAttribute("productList", productList);
		model.addAttribute("orderList", orderList);
		
		return "account-profile";
	}
	/*
	 * 회원 위시리스트
	 */
	@LoginCheck
	@RequestMapping(value = "/account-wishlist")
	public String user_wishlist(HttpSession session,Model model) throws Exception {
		String sUserId=(String)session.getAttribute("sUserId");
		User loginUser=userService.findUser(sUserId);
		List<Product> productList=productService.getProductList();
		List<CartItem> cartItemList = cartService.getCartList(sUserId);
		int cartTotPrice=0;
		for (CartItem cartItem : cartItemList) {
			cartTotPrice+=cartItem.getProduct().getP_price()*cartItem.getCart_qty();
		}
		List<Order> orderList=orderService.list(sUserId);
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("cartTotPrice", cartTotPrice);
		model.addAttribute("productList", productList);
		model.addAttribute("orderList", orderList);
		
		return "account-wishlist";
	}
}
