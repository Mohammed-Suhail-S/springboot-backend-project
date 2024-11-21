package com.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signup.dto.SignupDto;
import com.signup.model.SignupModel;
import com.signup.service.SignupService;

@RestController
@RequestMapping("/signup")
public class SignupController {

	@Autowired
	private SignupService signupService;
	
	@PostMapping("/saveData")
	public String save(@RequestBody SignupDto signupDto) {
		SignupModel signupmodel = signupService.saveData(signupDto);
		if(signupmodel!=null) {
			return "successfully added";
		}
			return "failed";
	}
	
	@GetMapping("/getAll")
	public List<SignupDto>getAllProduct() {
		return signupService.getAllProductDetails();
	}
	
}
