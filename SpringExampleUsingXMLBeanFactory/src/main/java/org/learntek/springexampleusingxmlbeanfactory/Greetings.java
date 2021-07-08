package org.learntek.springexampleusingxmlbeanfactory;

public class Greetings {
	
	private String greetings;

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	public String sendGreetings() {
		return "Good Morning";
	}

}
