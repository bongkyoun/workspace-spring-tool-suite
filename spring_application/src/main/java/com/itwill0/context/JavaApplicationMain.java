package com.itwill0.context;

import com.itwill.product.ProductDao;
import com.itwill.product.ProductDaoImpl;
import com.itwill.product.ProductService;

public class JavaApplicationMain {

	public static void main(String[] args) {
		/*********************case1*********************
		ProductService productService1=new ProductService();
		System.out.println(productService1.productList());
		System.out.println(productService1.productDetail(123));
		*******************/
		
		/********************case2**************************/
		ProductDao productDao2=
				new ProductDaoImpl();
		ProductService productService2=
				new ProductService(productDao2);
		System.out.println(productService2.productList());
		System.out.println(productService2.productDetail(123));
		/**************************************************/
		
		/********************case3**************************/
		ProductDao productDao3=new ProductDaoImpl();
		ProductService productService3=new ProductService();
		productService3.setProductDao(productDao3);
		System.out.println(productService3.productList());
		System.out.println(productService3.productDetail(123));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}