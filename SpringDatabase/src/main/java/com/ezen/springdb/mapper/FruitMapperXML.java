package com.ezen.springdb.mapper;

import java.util.List;

import com.ezen.springdb.dto.FruitDTO;

public interface FruitMapperXML {
	
	List<FruitDTO> getAll();
	
	FruitDTO get(int pk);
	
	int add(FruitDTO dto);
	
	int updateFruit(FruitDTO dto);
	
	int delete(int fruit_id);
	
}
