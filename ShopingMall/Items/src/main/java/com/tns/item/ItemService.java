package com.tns.item;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public List<Item> listall(){
		return repository.findAll();
		
	}
	//add admin
	public void add(Item Item) {
		repository.save(Item);
	}
	
	//delete admin
	public void  delete(Integer id) {
		repository.deleteById(id);
		
	}
	
	//get admin by id
	public Item get(Integer id) {
		return repository.findById(id).get();
		
	}
	
	

}

