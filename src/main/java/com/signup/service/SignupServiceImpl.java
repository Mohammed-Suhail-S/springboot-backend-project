package com.signup.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.dto.SignupDto;
import com.signup.model.SignupModel;
import com.signup.repository.SignupRepositoryService;

@Service
public class SignupServiceImpl implements SignupService {
	
	@Autowired
	private SignupRepositoryService signupRepositoryService;

	@Override
	public SignupModel saveData(SignupDto signupDto) {
		
		SignupModel signup = new SignupModel();
		
		signup.setId(signupDto.getId());
		signup.setName(signupDto.getName());
		signup.setEmail(signupDto.getEmail());
		signup.setPassword(signupDto.getPassword());
		
		return signupRepositoryService.save(signup);
	}

	@Override
	public List<SignupDto> getAllProductDetails() {
		List<SignupModel> model = signupRepositoryService.findAll();
		return model.stream().map(signup -> {
			SignupDto signupDto = new SignupDto();
			signupDto.setId(signup.getId());
			signupDto.setName(signup.getName());
			signupDto.setEmail(signup.getEmail());
			signupDto.setPassword(signup.getPassword());
			return signupDto;
		}).collect(Collectors.toList());
	}

}

