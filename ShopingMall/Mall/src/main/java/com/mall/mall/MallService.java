package com.mall.mall;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;





@Service
@Transactional
public class MallService {
	
	
	@Autowired
	private MallRepository repository;
	
	//retrive
	public List<Mall1> listall(){
		return repository.findAll();
		
	}
	
	//getByid 
	public Mall1 get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(Mall1 mall) {
		repository.save(mall);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
