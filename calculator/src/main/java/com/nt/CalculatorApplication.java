package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.Calculator;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CalculatorApplication.class, args);
		Calculator ob = run.getBean("sum", Calculator.class);
		ob.add();
		
	}

}
