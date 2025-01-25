package com.howtodoinjava.aop;

import org.springframework.stereotype.Component;



@Component
@org.springframework.context.annotation.Scope("prototype")
public class Freak {
	
	public void f1()
	{
		System.out.println("this is f1 of freak class");
	}

}
