package com.alessandrocavalli.camundaldap;

import org.apache.ibatis.logging.LogFactory;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableProcessApplication("testorario")
public class Application {
  public static void main(String... args) {
	 
	  LogFactory.useSlf4jLogging();
    
	  SpringApplication.run(Application.class, args);
  }
  
 

}