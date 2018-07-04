package in.prashant.microservices.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.prashant.microservices.order.domain.Order;
import in.prashant.microservices.order.service.IOrderService;

/**
 * 
 * @author prashantsingh
 *
 */

@RestController
@RequestMapping("/v1/api/orders")
public class OrdersController {

	@Autowired
	private IOrderService orderService;

	/**
	 * Get the Order details for the provided order id
	 * 
	 * @param orderID
	 * @return Order details for the given order id
	 */
	@GetMapping("/{orderId}")
	public Order findOrderById(@PathVariable("orderId") String orderID) {
		System.out.println(this.getClass().getCanonicalName() + "  findOrderById  -> Order id" + orderID);
		return orderService.getOrderByOrderId(orderID);
	}

	/**
	 * Get All Orders
	 * 
	 * @return List<Order>
	 */
	@GetMapping("/")
	public List<Order> findOrders() {
		return orderService.getAllOrders();
	}

}
