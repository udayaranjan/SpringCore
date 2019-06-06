package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;import com.beans.Shape;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object bean = context.getBean("circleObj");
		
		Shape s = (Shape)bean;
		
		System.out.println("Area of Cirle is "+s.area(26));

	}

}
