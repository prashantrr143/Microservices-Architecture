package in.prashant.microservices.order.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import in.prashant.microservices.order.domain.Item;
import in.prashant.microservices.order.domain.Order;

@Service
public class OrderService implements IOrderService{

	private static List<Order> orderRepository = createDummyOrders();

	public List<Order> getAllOrders() {
		return OrderService.orderRepository;
	}

	public Order getOrderByOrderId(String orderID) {

		return orderRepository.stream().filter(o -> o.getOrderId().equalsIgnoreCase(orderID)).findFirst().get();

	}

	private static List<Order> createDummyOrders() {

		Order order = new Order();

		Item item = new Item();
		item.setId(1000L);
		item.setItemDescription("Newly launced next generation smart phone in the market");
		item.setItemName("One Plus 6S");
		item.setPrice(new BigDecimal("34777.00"));

		Item item2 = new Item();
		item2.setId(1003L);
		item2.setItemName("iPad X12");
		item2.setItemDescription("Apple's next innovative touch enabled iPad");
		item2.setPrice(new BigDecimal("78450.00"));

		Set<Item> itemList = new HashSet<>();
		itemList.add(item);
		itemList.add(item2);
		order.setItems(itemList);
		
		
		
		Order order2 = new Order();

		Item item3 = new Item();
		item3.setId(78454L);
		item3.setItemDescription("In ear bluetooth headphones with voice support");
		item3.setItemName("Boat Leaf Ear Headphone");
		item3.setPrice(new BigDecimal("2000.00"));

		Item item4 = new Item();
		item4.setId(18956L);
		item4.setItemName("Samsung 320L Headset");
		item4.setItemDescription("Samsung bluetooth headset with navigation control");
		item4.setPrice(new BigDecimal("780.00"));

		Set<Item> itemList2 = new HashSet<>();
		itemList2.add(item3);
		itemList2.add(item4);
		order2.setItems(itemList2);

		List<Order> ordersList = new ArrayList<>();
		ordersList.add(order2);
		ordersList.add(order);

		
		
		
		
		
		
		
		
		return ordersList;

	}

}
