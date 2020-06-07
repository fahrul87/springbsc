package com.fahrul.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//Materi LifeCycle 

@Component
public class DatabaseService {
	
	@PostConstruct
	public void openConnection() {
		System.out.println("Membuka Koneksi Database");
	}
	
	@PreDestroy
	public void closeConnection() {
		System.out.println("Menutup Koneksi Database");
	}

}
