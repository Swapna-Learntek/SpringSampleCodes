package org.learntek.springhelloworldusingjavaconfig;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Welcome to Learntek Spring Course");
	}
	
}
