package com.fahrul.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Materi Langue Expression

@Component
public class Exam {
	
	private String authorName;
	
	private int nilai;

	//update 1
//	@Autowired
//	public Exam(@Value("#{author.name}")String authorName) { //@Value get data Author nama bean
//		
//		this.authorName = authorName;
//	}
	
	// update 2
//	@Autowired
//	public Exam(@Value("#{author.getName()}")String authorName) { //@Value get data Author nama bean
//		
//		this.authorName = authorName;
//	}
	
	// update 3
	@Autowired
	public Exam(@Value("#{author.getName()}")String authorName,@Value("#{10*10}")int nilai) { //@Value get data Author nama bean
		
		this.authorName = authorName;
		this.nilai = nilai;
	}

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	
}
