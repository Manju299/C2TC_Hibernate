package com.mall.admin;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Service
@Transactional
public class MallAdminService {
	
	@Autowired
	private MallAdminRepository repository;
	
	public List<MallAdmin> listall(){
		return repository.findAll();
		
	}
	//add admin
	public void add(MallAdmin malladmin) {
		repository.save(malladmin);
	}
	
	//delete admin
	public void  delete(Integer id) {
		repository.deleteById(id);
		
	}
	
	//get admin by id
	public MallAdmin get(Integer id) {
		return repository.findById(id).get();
		
	}
	
	

}
