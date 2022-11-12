package com.tns.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department = new Department();
		department.setId(1);
		department.setName("Sales");
		
		
		Employee e1 = new Employee();
		e1.setEmployeeid(1000);
		e1.setName("Sridhar");
		e1.setSalary(200000);
		
		department.addEmployee(e1);
		em.persist(department);
		em.getTransaction().commit();
		System.out.println("Operation successfull");

	}

}
