package com.fahrul.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Materi Bean
public class DataBean {
	
	private String value;
	
	public DataBean(String value) {
		this.value = value;
		
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	
	// Materi LifeCycle 
	
	@PostConstruct
	public void init() {
		System.out.println("init Database = " + value);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy Databse" + value);
	}
}
