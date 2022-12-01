package com.tns.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ItemController {
	@Autowired
	private ItemService service;
	
	
	@PostMapping("/Item")
	public void add(@RequestBody Item item) {
		service.add(item);
		
	}
	
	@DeleteMapping("/Item/{id}")
	public void remove(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PutMapping("/Item/{id}")
	public ResponseEntity<?> update(@RequestBody Item item,@PathVariable Integer id){
		try {
			Item exisitingitem =  service.get(id);
			service.add(item);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/Item/{id}")
	public ResponseEntity<Item> get(@PathVariable Integer id ){
		try {
			Item item = service.get(id);
			return new ResponseEntity<Item>(item,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/Item")
	public List<Item> list(){
		return service.listall();
	}
	

}
