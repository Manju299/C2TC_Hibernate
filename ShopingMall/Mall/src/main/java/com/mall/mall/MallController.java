package com.mall.mall;

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
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MallController {
	
	
	@Autowired
	private MallService mallservice;
	
	@GetMapping("/mall")
	public List<Mall1> list(){
		return mallservice.listall();
	}
	
	@GetMapping("/mall/{id}")
	public ResponseEntity<Mall1> get(@PathVariable Integer id){
		try {
			Mall1 mall  = mallservice.get(id);
			return new ResponseEntity<Mall1>(mall,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Mall1>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/mall")
	public void save(@RequestBody Mall1 mall) {
		mallservice.save(mall);
	}
	
	@PutMapping("/mall/{id}")
	public ResponseEntity<?> update(@RequestBody Mall1 mall,@PathVariable Integer id){
		try {
			Mall1 existmall = mallservice.get(id);
			mallservice.save(mall);
			return new ResponseEntity<> (HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//delete
	@DeleteMapping("/mall/{id}")
	public void delete(@PathVariable Integer id) {
		mallservice.delete(id);
	}

	

}
