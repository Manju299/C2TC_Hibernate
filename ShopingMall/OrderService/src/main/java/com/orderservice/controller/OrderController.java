package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.Service.OrderService;
import com.orderservice.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@PostMapping("/orders")
	public ResponseEntity<Order> add(@RequestBody Order order)
	{   Order   order1= orderService. addOrder(order);   
		return new ResponseEntity<Order>(order1,HttpStatus.OK);
		
	}
	@PutMapping("/ordersupdate")
	public ResponseEntity<Order> put(@RequestBody Order order)
	{
		 try{
			 Order  order1=orderService.updateOrder(order);
		 return new ResponseEntity<Order>(order1,HttpStatus.OK);}
		 catch(Exception e)
		 {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
	}
	@GetMapping("/orders/{id}")
	public  ResponseEntity<Order> get(@PathVariable Integer id)
	{
		try {
	  Order order1=orderService.getOrder(id);	
		return new ResponseEntity<Order>(order1,HttpStatus.OK);
		}
		catch(Exception e)
		 {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
	}
	@DeleteMapping("/ordersDelete/{id}")
	public  ResponseEntity<String> delete(@PathVariable Integer id){
	
		String s=orderService.deleteOrder(id);
		return ResponseEntity.ok(s);
	}
	
}
