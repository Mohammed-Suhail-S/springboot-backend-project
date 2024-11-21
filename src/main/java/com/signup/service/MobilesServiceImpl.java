package com.signup.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.dto.MobilesDto;
import com.signup.model.MobilesModel;
import com.signup.repository.MobilesRepositoryService;

@Service
public class MobilesServiceImpl implements MobilesService {

	@Autowired
	private MobilesRepositoryService mobilesRepositoryService;
	
	@Override
	public MobilesModel saveMobiles(MobilesDto mobilesDto) {
		
		MobilesModel mobiles = new MobilesModel();
		
		mobiles.setId(mobilesDto.getId());
		mobiles.setName(mobilesDto.getName());
		mobiles.setOfferPrice(mobilesDto.getOfferPrice());
		mobiles.setOriginalPrice(mobilesDto.getOriginalPrice());
		mobiles.setRating(mobilesDto.getRating());
		mobiles.setTitle(mobilesDto.getTitle());
		mobiles.setDelivery(mobilesDto.getDelivery());
		mobiles.setCategory(mobilesDto.getCategory());
		mobiles.setImage(mobilesDto.getImage()); 
		
		return mobilesRepositoryService.save(mobiles);
	}

	@Override
	public List<MobilesDto> getAllMobileDetails() {
		List<MobilesModel> model = mobilesRepositoryService.findAll();
		return model.stream().map(mobiles -> {
			MobilesDto mobilesDto = new MobilesDto();
			mobilesDto.setId(mobiles.getId());
			mobilesDto.setName(mobiles.getName());
			mobilesDto.setOfferPrice(mobiles.getOfferPrice());
			mobilesDto.setOriginalPrice(mobiles.getOriginalPrice());
			mobilesDto.setRating(mobiles.getRating());
			mobilesDto.setTitle(mobiles.getTitle());
			mobilesDto.setDelivery(mobiles.getDelivery());
			mobilesDto.setCategory(mobiles.getCategory());
			mobilesDto.setImage(mobiles.getImage());
			return mobilesDto;
		}).collect(Collectors.toList());
	}

}

