package org.learntek.springjdbctemplateexample.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "org.learntek.springjdbctemplateexample")
@PropertySource(value = {"classpath:application.properties"})
public class ApplicationConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jTemplate(DataSource dataSource) {
		JdbcTemplate jtemp = new JdbcTemplate(dataSource);
		jtemp.setResultsMapCaseInsensitive(true);
		return jtemp;

	}

}
