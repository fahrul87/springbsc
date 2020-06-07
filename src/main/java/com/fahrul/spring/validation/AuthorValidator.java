package com.fahrul.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.fahrul.spring.model.Author;

// Materi Spring Validation

public class AuthorValidator  implements Validator  {
	
	

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Author.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Author author = (Author) target;
		if(author.getName()==null || author.getName().trim().isEmpty()) {
			errors.rejectValue("name", "author.name.blank");
		}
		if(author.getEmail()==null || author.getEmail().trim().isEmpty()) {
			errors.rejectValue("email", "author.email.blank");
		}
		
	}

}
