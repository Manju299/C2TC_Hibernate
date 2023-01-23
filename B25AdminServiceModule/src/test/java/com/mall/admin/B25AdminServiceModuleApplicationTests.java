package com.mall.admin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class B25AdminServiceModuleApplicationTests {
	
	@Autowired
	private MallAdminService service;
	
	@MockBean
	private MallAdminRepository repo; 
	
	@BeforeEach
	void setup() {
	
		Optional<MallAdmin> mall = Optional.of(new MallAdmin(1,"Manjunath","1234","max","1234566"));
		Mockito.when(repo.findById(1)).thenReturn(mall);
	}

	@Test
	void testGetMallAdminById() {
		String name = "Manjunath";
		MallAdmin admin = service.get(1);
		assertEquals(name, admin.getName());
		
	}
	
	@Test 
	void testGetMallAdminByIdFailingTest(){
		String name = "Kumar";
		MallAdmin admin1 = service.get(1);
		assertNotEquals(name, admin1.getName());
	}
	
	

}
