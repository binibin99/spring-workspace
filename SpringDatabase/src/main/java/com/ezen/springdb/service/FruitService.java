package com.ezen.springdb.service;

import org.springframework.ui.Model;

import com.ezen.springdb.dto.FruitDTO;

public interface FruitService {
	
	int updateForm(Model model, int fruit_id);

	void getFruitList(Model model);
	
	int update(FruitDTO dto);
	
}
