package org.learntek.springhelloworldusingjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	@Scope("singleton")
	public HelloWorld helloWorld() {
		HelloWorld helloWorldBean = new HelloWorld();
		helloWorldBean.setMessage("welcome to spring course");
		return helloWorldBean;
	}
}
