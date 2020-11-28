package com.pushkal.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pushkal.domain.Doctor;

public class DoctorValidation implements Validator {

	public boolean supports(Class<?> argo) {
		return Doctor.class.equals(argo);
	}

	public void validate(Object target, Errors errors) {

	}

}
