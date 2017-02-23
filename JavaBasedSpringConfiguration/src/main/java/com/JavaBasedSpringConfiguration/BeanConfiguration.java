/**
 * 
 */
package com.JavaBasedSpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.JavaBasedSpringConfiguration.model.Department;
import com.JavaBasedSpringConfiguration.model.Employee;

/**
 * @author sushank_dahiwadkar
 *
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Employee getEmployee() {
		return new Employee(getDepartment());
	}
	
	@Bean
	public Department getDepartment() {
		return new Department();
	}
}
