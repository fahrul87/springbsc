package com.fahrul.spring.model;

import org.springframework.stereotype.Component;

// Materi Component Injection
@Component
public class SayHelloFilter {
	
	public String filter(String value) {
		return value.toUpperCase();
	}

}
