package com.signup.service;

import java.util.List;

import com.signup.dto.SignupDto;
import com.signup.model.SignupModel;

public interface SignupService {

	public SignupModel saveData(SignupDto signupDto);

	public List<SignupDto> getAllProductDetails();
	
}
