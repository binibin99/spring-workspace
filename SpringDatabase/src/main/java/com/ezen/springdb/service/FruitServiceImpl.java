package com.ezen.springdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ezen.springdb.dto.FruitDTO;
import com.ezen.springdb.mapper.FruitMapperXML;

@Service
public class FruitServiceImpl implements FruitService {
	
	@Autowired
	FruitMapperXML fruitMapper;

	@Override
	public int updateForm(Model model, int fruit_id) {
		FruitDTO fruit = fruitMapper.get(fruit_id);
		
		if (fruit == null) {
			return -1;
		}
		
		model.addAttribute("fruit", fruit);
//		model.addAttribute("countries", countryMapper.getAll());
		
		return 1;
	}
	
	@Override
	public void getFruitList(Model model) {
		model.addAttribute("fruit", fruitMapper.getAll());
	}
	
	@Override
	public int update(FruitDTO dto) {
		return fruitMapper.updateFruit(dto);
	}
	
}
