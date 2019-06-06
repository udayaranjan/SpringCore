package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Cirlce;
import com.beans.Shape;

@Configuration
public class AppConfig {
	
	@Bean
	public Shape circleObj() {
		
		Cirlce cr = new Cirlce();
		return cr;
	}
}
