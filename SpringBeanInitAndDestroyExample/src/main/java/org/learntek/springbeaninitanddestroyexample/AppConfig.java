package org.learntek.springbeaninitanddestroyexample;

//import org.learntek.springhelloworldusingjavaconfig.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "org.learntek.springbeaninitanddestroyexample")
public class AppConfig {
	
	@Bean
	@Scope("singleton")
	public DatabaseInitializer dbInit() {
		DatabaseInitializer dbBean = new DatabaseInitializer();
		
		return dbBean;
	}

}
