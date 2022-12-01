package com.tns.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@javax.transaction.Transactional
public class CustomerService {




	
	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> listall(){
		return repository.findAll();
		
	}
	//add admin
	public void add(Customer Customer) {
		repository.save(Customer);
	}
	
	//delete admin
	public void  delete(Integer id) {
		repository.deleteById(id);
		
	}
	
	//get admin by id
	public Customer get(Integer id) {
		return repository.findById(id).get();
		
	}
	
	

}



