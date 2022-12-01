package com.orderservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.dataJPArepositroy.OrderRepositroy;
import com.orderservice.model.Order;

@Service
public class OrderService {
@Autowired
private OrderRepositroy orderRepository;
	public Order addOrder(Order order) {
		return orderRepository.save(order);
			}
	public Order updateOrder(Order order) {
		
		Order order2=orderRepository.findById(order.getId()).get();
		order2.setPrice(order.getPrice());
		return orderRepository.save(order2);
	
	}
	public Order getOrder(Integer id) {
		return orderRepository.findById(id).get();
	}
	public String deleteOrder(Integer id) {
		if(orderRepository.findById(id).isPresent())
		{
		orderRepository.deleteById(id);
		return "Data deleted";
		}
		else
		{
			return "data not present";
		}
		
	}
	

}
