package in.prashant.microservices.order.service;

import java.util.List;

import in.prashant.microservices.order.domain.Order;
import in.prashant.microservices.order.exceptions.OrderNotFoundException;

public interface IOrderService {

	public List<Order> getAllOrders();

	public Order getOrderByOrderId(String orderID) throws OrderNotFoundException;
}
