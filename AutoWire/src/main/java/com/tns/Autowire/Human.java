package com.tns.Autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	
	
	public Human(Heart heart) {
		System.out.println("Constructor is called");
		this.heart = heart;
	}



	public void startPumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.print("Dead");
		}
	}

}
