package com.ezen.springrest.dto;

import lombok.Data;

@Data
public class FruitDTO {
	
	private Integer fruit_id;
	private String fruit_name;
	private Integer fruit_price;
	private String fruit_grade;
	private String country_id;
}
