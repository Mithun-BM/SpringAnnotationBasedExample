package com.example.annotation.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.annotationbased.classes.Employee;
import com.example.annotationbased.classes.Manager;

//Instead of bean.xml we have everything configured in annotated classes
@Configuration
public class AppConfig  {

	@Bean(name="employee")
	@Scope(BeanDefinition.SCOPE_SINGLETON)//@Scope(BeanDefinition.SCOPE_SINGLETON),@Scope(BeanDefinition.SCOPE_PROTOTYPE),@Scope("singleton"),@Scope("prototype")  <!-- singleton , prototype, request , session , global-session -->
	public Employee employee(){
		Employee employee= new Employee();
		employee.setFirstName("AnnotationBasedEfirstName");
		employee.setMiddleName("AnnotationBasedEmiddleName");
		employee.setLastName("AnnotationBasedElastName");
		return employee;
	}

	@Bean(name="employee1")
	@Scope(BeanDefinition.SCOPE_SINGLETON)//@Scope(BeanDefinition.SCOPE_SINGLETON),@Scope(BeanDefinition.SCOPE_PROTOTYPE),@Scope("singleton"),@Scope("prototype") <!-- singleton , prototype, request , session , global-session -->
	public Employee employee1(){
		return new Employee();
	}

	@Bean(name="emp")
	@Scope(BeanDefinition.SCOPE_SINGLETON)//@Scope(BeanDefinition.SCOPE_SINGLETON),@Scope(BeanDefinition.SCOPE_PROTOTYPE),@Scope("singleton"),@Scope("prototype") <!-- singleton , prototype, request , session , global-session -->
	public Employee employee2(){
		Employee employee= new Employee();
		employee.setFirstName("AnnotationBasedEfirstName");
		employee.setMiddleName("AnnotationBasedEmiddleName");
		employee.setLastName("AnnotationBasedElastName");
		return employee;
	}

	@Bean(name="manager")
	@Scope(BeanDefinition.SCOPE_SINGLETON)//@Scope(BeanDefinition.SCOPE_SINGLETON),@Scope(BeanDefinition.SCOPE_PROTOTYPE),@Scope("singleton"),@Scope("prototype")  <!-- singleton , prototype, request , session , global-session -->
	public Manager manager(){
		Manager manager= new Manager();
		manager.setMfirstName("AnnotationBasedMfirstName");
		manager.setMmiddleName("AnnotationBasedMmiddleName");
		manager.setMlastName("AnnotationBasedMlastName");
		return manager;
	}

	@Bean(name="manager1")
	@Scope(BeanDefinition.SCOPE_SINGLETON)//@Scope(BeanDefinition.SCOPE_SINGLETON),@Scope(BeanDefinition.SCOPE_PROTOTYPE),@Scope("singleton"),@Scope("prototype")  <!-- singleton , prototype, request , session , global-session -->
	public Manager manager1(){
		return new Manager();
	}
}