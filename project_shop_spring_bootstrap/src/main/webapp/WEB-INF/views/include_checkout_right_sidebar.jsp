<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<aside class="sidebar">
	<div class="padding-top-2x hidden-lg-up"></div>
	<!-- Order Summary Widget-->
	<section class="widget widget-order-summary">
		<h3 class="widget-title">Order Summary</h3>
		<table class="table">
			<tr>
				<td>Cart Subtotal:</td>
				<td class="text-medium">&#8361;<s:eval	expression="new java.text.DecimalFormat('#,##0').format(cartTotPrice)" />
				</td>
			</tr>
			<tr>
				<td>Shipping:</td>
				<td class="text-medium">&#8361;0</td>
			</tr>
			<tr>
				<td>Estimated tax:</td>
				<td class="text-medium">&#8361;0</td>
			</tr>
			<tr>
				<td></td>
				<td class="text-lg text-medium">&#8361;<s:eval expression="new java.text.DecimalFormat('#,##0').format(cartTotPrice)" /></td>
			</tr>
		</table>
	</section>
	<!-- Featured Products Widget-->
	<section class="widget widget-featured-products">
		<h3 class="widget-title">Recently Viewed</h3>
		<c:forEach items="${viewProductList}" var="product">
		<!-- Entry-->
		<div class="entry">
			<div class="entry-thumb">
				<a href="shop-single.html"><img src="img/shop/widget/${product.p_image}"
					alt="Product"></a>
			</div>
			<div class="entry-content">
				<h4 class="entry-title">
					<a href="shop-single?p_no=${product.p_no}">${product.p_name}</a>
				</h4>
				<span class="entry-meta">&#8361; <s:eval expression="new java.text.DecimalFormat('#,###.0').format(product.p_price)"/></span>
			</div>
		</div>
		</c:forEach>

	</section>
	<!-- Promo Banner-->
	<section class="promo-box"
		style="background-image: url(img/banners/${viewProductList[0].p_image});">
		<span class="overlay-dark" style="opacity: .4;"></span>
		<div
			class="promo-box-content text-center padding-top-2x padding-bottom-2x">
			<h4 class="text-light text-thin text-shadow">New Collection of</h4>
			<h3 class="text-bold text-light text-shadow">${viewProductList[0].p_name}</h3>
			<a class="btn btn-outline-white btn-sm" href="shop-grid-ns">Shop
				Now</a>
		</div>
	</section>
</aside>