package org.test.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "emp1")
	@Scope(value = "prototype")
	public Employee getBean()
	{
		return new Employee(123,"Raman",45000);
	}
}
