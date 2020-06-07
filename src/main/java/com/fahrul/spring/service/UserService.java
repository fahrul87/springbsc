package com.fahrul.spring.service;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.fahrul.spring.model.User;

// Materi bean validation

@Component
@Validated //class di valitadated
public class UserService {
	
	public void save(@Valid User user) { // cek valid methpd {
		System.out.println("Sukses menyimpan user baru");
	}
	
	public User getByid(@NotBlank String id) {
		System.out.println("Sukses menyimpan user baru");
		return null;
	}

}
