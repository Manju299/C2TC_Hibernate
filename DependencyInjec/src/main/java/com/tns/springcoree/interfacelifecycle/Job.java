package com.tns.springcoree.interfacelifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Job implements InitializingBean,DisposableBean
{
	private String desiganation;

	public String getDesiganation() {
		return desiganation;
	}

	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Job [desiganation=" + desiganation + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing the bean");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying the bean");
		
	}
	
	

}
