package com.nt.model;

import org.springframework.stereotype.Component;

@Component("sum")
public class Calculator {

	public void   add()
	{
		System.out.println("addition method");
	}
}
