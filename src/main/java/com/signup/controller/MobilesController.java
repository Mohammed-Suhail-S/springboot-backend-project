package com.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signup.dto.MobilesDto;
import com.signup.model.MobilesModel;
import com.signup.service.MobilesService;

@RestController
@RequestMapping("/mobiles")
public class MobilesController {

	@Autowired
	private MobilesService mobilesService;
	
	@PostMapping("/data")
	public String save(@RequestBody MobilesDto mobilesDto) {
		MobilesModel mobilesmodel = mobilesService.saveMobiles(mobilesDto);
		if(mobilesmodel != null) {
			return "process completed successfully";
		}
			return "process failed";
	}
	
	@GetMapping("/getAll")
	public List<MobilesDto>getAllMobiles() {
		return mobilesService.getAllMobileDetails();
	}
	
}
