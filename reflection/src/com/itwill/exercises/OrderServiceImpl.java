package com.itwill.exercises;
@Service(value = "orderService")
public class OrderServiceImpl {
	@AutoWire
	@Qualifier("orderDao")
	private OrderDaoImpl OrderdaoImpl;
	
	public OrderServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@AutoWire()
	public OrderServiceImpl(@Qualifier(value = "orderDao") OrderDaoImpl orderdaoImpl) {
		super();
		OrderdaoImpl = orderdaoImpl;
	}

	public OrderDaoImpl getOrderdaoImpl() {
		return OrderdaoImpl;
	}
	@AutoWire(value = "orderDao")
	public void setOrderdaoImpl(OrderDaoImpl orderdaoImpl) {
		OrderdaoImpl = orderdaoImpl;
	}
	
	


}
