package com.tns.hibernate.joinedtable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		Employee e = new Employee();
		e.setName("jack");
		e.setSalary(1000000);
		em.persist(e);
		
		Manager d = new Manager();
		d.setName("jenni");
		d.setSalary(200000);
		d.setDepartmentName("Development");
		em.persist(d);
		
		em.getTransaction().commit();
		
		

	}

}