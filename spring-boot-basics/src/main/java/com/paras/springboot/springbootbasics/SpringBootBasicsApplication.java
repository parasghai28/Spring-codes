package com.paras.springboot.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@SpringBootApplication has 3 purposes - auto config, component scanning and spring boot application context
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootBasicsApplication.class, args);
		//Application context is returned by SpringApplication.run() and it has all the beans created
		ApplicationContext context =  SpringApplication.run(SpringBootBasicsApplication.class, args);
		/*for(String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}
	
	/*
	 * Auto configuration in Spring
	 * 
	 * let's start with a question: why do we need spring boot auto configuration?
	 * spring based applications have a lot of configuration.
	 * when we use spring mvc, we need to configure a component scan, 
	 * the dispatcher servlet, a view resolver, web jars (for delivering static content), among other things.when we use
	 *  hibernate/jpa, we would need to configure a datasource, an entity manager factory, a transaction manager,
	 *  among a host of other things.
	 *  
	 *  can we bring more intelligence into this?
	 *  when a spring mvc jar is added into an application, can we auto configure some beans automatically?
	 *  
	 *  spring boot looks at a) frameworks available on the classpath 
	 *  b) existing configuration for the application. 
	 *  based on these, spring boot provides basic configuration needed to
	 *  configure the application with these frameworks. this is called  auto configuration  .
	 * */

}
