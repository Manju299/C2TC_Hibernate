package com.tns.singleTable.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		
		employee.setName("Manjunath");
		employee.setSalary(30000);
		em.persist(employee);
		
		Manager manager = new Manager();
	
		manager.setName("Sridhar");
		manager.setSalary(50000);
		manager.setDepartmentName("Production");
		em.persist(manager);
		System.out.println("Operation Successful");
		em.getTransaction().commit();

	}

}
