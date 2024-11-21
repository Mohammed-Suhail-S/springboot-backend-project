package com.signup.service;

import java.util.List;

import com.signup.dto.MobilesDto;
import com.signup.model.MobilesModel;

public interface MobilesService {

	public MobilesModel saveMobiles(MobilesDto mobilesDto);
	
	public List<MobilesDto> getAllMobileDetails();
	
}
