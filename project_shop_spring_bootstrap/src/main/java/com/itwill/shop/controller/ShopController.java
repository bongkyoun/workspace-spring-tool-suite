package com.itwill.shop.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.shop.cart.CartItem;
import com.itwill.shop.cart.CartService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

@Controller
public class ShopController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CartService cartService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/index")
	public String user_main(Model model,HttpSession session) throws Exception{
		String sUserId=(String)session.getAttribute("sUserId");
		
		List<Product> productList=productService.getProductList();
		User loginUser=new User();
		List<CartItem> cartItemList=new ArrayList<CartItem>();
		int cartTotPrice=0;
		if(sUserId!=null) {
			loginUser=userService.findUser(sUserId);
			cartItemList = cartService.getCartList(sUserId);
			for (CartItem cartItem : cartItemList) {
				cartTotPrice+=cartItem.getProduct().getP_price()*cartItem.getCart_qty();
			}
		}
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("cartTotPrice", cartTotPrice);
		model.addAttribute("productList", productList);
		return "index";
	}
	
	@RequestMapping(value = "/error404")
	public String page_404(Model model,HttpSession session) throws Exception{
		String sUserId=(String)session.getAttribute("sUserId");
		
		List<Product> productList=productService.getProductList();
		User loginUser=new User();
		List<CartItem> cartItemList=new ArrayList<CartItem>();
		int cartTotPrice=0;
		if(sUserId!=null) {
			loginUser=userService.findUser(sUserId);
			cartItemList = cartService.getCartList(sUserId);
			for (CartItem cartItem : cartItemList) {
				cartTotPrice+=cartItem.getProduct().getP_price()*cartItem.getCart_qty();
			}
		}
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("cartTotPrice", cartTotPrice);
		model.addAttribute("productList", productList);
		return "error404";
	}
}
