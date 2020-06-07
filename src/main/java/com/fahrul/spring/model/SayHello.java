package com.fahrul.spring.model;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

// Materi Component
// Otomatis Bean Component

// Materi International
@Component
public class SayHello implements MessageSourceAware {
	
	private SayHelloFilter filter;
	
	private MessageSource messageSource;
	
	// Materi Component Injection
	@Autowired // anotation otomatis construc kosong  untuk dependcy injection component 
	public SayHello(SayHelloFilter filter) {
		this.filter = filter;
	}
	
	
	
//	public String hello(String name) {
//		return "Hello" + name;
//	}
	
	
	// Materi Component Injection
//	public String hello(String name) {
//		return filter.filter("Hello"+name);
//	}
	
	
	//  Materi Internatiozation 
	public String hello(String name) {
		return filter.filter(messageSource.getMessage("hello", null,Locale.getDefault())+ name);
	}


//  Materi Internatiozation 
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
		
	}

}
